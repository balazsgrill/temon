/**
 * 
 */
package hu.temon.editor.impl.configuration;

import hu.temon.ast.TerminalNode;
import hu.temon.editor.TextualModelEditor;
import hu.temon.grammar.Terminal;
import hu.temon.parser.AbstractTextualResource;
import hu.temon.parser.IFeatureResolver;
import hu.temon.parser.impl.Tokenizer;
import hu.temon.parser.impl.tracking.ElementCreationTracker;
import hu.temon.parser.impl.tracking.FeatureSetPoint;
import hu.temon.parser.scope.IFeatureScope;
import hu.temon.parser.scope.IScopeElement;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.contentassist.CompletionProposal;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.jface.text.contentassist.IContextInformation;
import org.eclipse.jface.text.contentassist.IContextInformationValidator;
import org.eclipse.jface.viewers.ILabelProvider;

/**
 * @author balazs.grill
 *
 */
public class FeatureResolverBasedContenAssistProcessor implements
		IContentAssistProcessor {

	private final AbstractTextualResource resource;
	
	private final ILabelProvider labelProvider;
	
	/**
	 * 
	 */
	public FeatureResolverBasedContenAssistProcessor(TextualModelEditor editor) {
		this.resource = editor.getResource();
		this.labelProvider = editor.getLabelProvider();
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
		if (featureSetPoint == null){
			/* TODO No feature is set here, try to enumerate possible keywords/terminals */
			return null;
		}
		
		IFeatureResolver featureResolver = resource.getFeatureResolver();
		Collection<IScopeElement> elements = enumerateElements(viewer.getDocument(), featureResolver, featureSetPoint, offset);
		
		ICompletionProposal[] proposals = new ICompletionProposal[elements.size()];
		
		int[] range = featureSetPoint.getRange();
		int length = range[1]-range[0];
		
		int i = 0;
		for(IScopeElement element : elements){
			
			String replacement = element.getIdentifier();
			if (featureSetPoint.getNode() instanceof TerminalNode){
				TerminalNode tn = (TerminalNode)featureSetPoint.getNode();
				Terminal term = tn.getTerminal();
				replacement = Tokenizer.getOriginalValue(replacement, term);
			}
			EObject eobject = element.getValue(resource.getResourceSet());
			proposals[i]=new CompletionProposal(replacement, range[0], length, replacement.length(), 
					labelProvider.getImage(eobject), replacement, null, labelProvider.getText(eobject));
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
