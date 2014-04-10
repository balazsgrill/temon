/**
 * 
 */
package hu.textualmodeler.editor.impl.configuration;

import hu.textualmodeler.parser.AbstractTextualResource;
import hu.textualmodeler.parser.IFeatureResolver;
import hu.textualmodeler.parser.impl.tracking.ElementCreationTracker;
import hu.textualmodeler.parser.impl.tracking.FeatureSetPoint;
import hu.textualmodeler.parser.scope.IFeatureScope;
import hu.textualmodeler.parser.scope.IScopeElement;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.contentassist.CompletionProposal;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.jface.text.contentassist.IContextInformation;
import org.eclipse.jface.text.contentassist.IContextInformationValidator;

/**
 * @author balazs.grill
 *
 */
public class FeatureResolverBasedContenAssistProcessor implements
		IContentAssistProcessor {

	private final AbstractTextualResource resource;
	
	/**
	 * 
	 */
	public FeatureResolverBasedContenAssistProcessor(AbstractTextualResource resource) {
		this.resource = resource;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.text.contentassist.IContentAssistProcessor#computeCompletionProposals(org.eclipse.jface.text.ITextViewer, int)
	 */
	@Override
	public ICompletionProposal[] computeCompletionProposals(ITextViewer viewer,
			int offset) {
		
		ElementCreationTracker elementTracker = resource.getElementCreationTracker();
		/* Content assist requires element tracking */
		if (elementTracker == null) return null;
		
		/* Find feature */
		FeatureSetPoint featureSetPoint = elementTracker.findFeatureSetPoint(offset);
		if (featureSetPoint == null) return null;
		
		IFeatureResolver featureResolver = resource.getFeatureResolver();
		Collection<IScopeElement> elements = enumerateElements(viewer.getDocument(), featureResolver, featureSetPoint, offset);
		
		ICompletionProposal[] proposals = new ICompletionProposal[elements.size()];
		
		int[] range = featureSetPoint.getRange();
		int length = range[1]-range[0];
		
		int i = 0;
		for(IScopeElement element : elements){
			
			String replacement = element.getIdentifier();
			proposals[i]=new CompletionProposal(replacement, range[0], length, replacement.length());
			i++;
		}
		
		return proposals;
	}
	
	public Collection<IScopeElement> enumerateElements(IDocument document, IFeatureResolver resolver, FeatureSetPoint point, int offset){
		List<IScopeElement> elements = new LinkedList<>();
		
		if (point.getFeature() instanceof EReference){
			String value = "";
			try {
				value = document.get(point.getRange()[0], offset-point.getRange()[0]);
			} catch (BadLocationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//String value = point.getValue().substring(0, offset-point.getRange()[0]);
			IFeatureScope scope = resolver.getScope(point.getContext(), (EReference)point.getFeature(), null, value);
			
			while(scope != null){
				elements.addAll(scope.getLocalElements());
				scope = scope.parentScope();
			}
		}
		
		return elements;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.text.contentassist.IContentAssistProcessor#computeContextInformation(org.eclipse.jface.text.ITextViewer, int)
	 */
	@Override
	public IContextInformation[] computeContextInformation(ITextViewer viewer,
			int offset) {
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.text.contentassist.IContentAssistProcessor#getCompletionProposalAutoActivationCharacters()
	 */
	@Override
	public char[] getCompletionProposalAutoActivationCharacters() {
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.text.contentassist.IContentAssistProcessor#getContextInformationAutoActivationCharacters()
	 */
	@Override
	public char[] getContextInformationAutoActivationCharacters() {
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.text.contentassist.IContentAssistProcessor#getErrorMessage()
	 */
	@Override
	public String getErrorMessage() {
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.text.contentassist.IContentAssistProcessor#getContextInformationValidator()
	 */
	@Override
	public IContextInformationValidator getContextInformationValidator() {
		return null;
	}

}
