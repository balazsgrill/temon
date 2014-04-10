/**
 * 
 */
package hu.textualmodeler.editor.impl.configuration;

import hu.textualmodeler.parser.AbstractTextualResource;

import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.contentassist.ContentAssistant;
import org.eclipse.jface.text.contentassist.IContentAssistant;
import org.eclipse.jface.text.presentation.IPresentationReconciler;
import org.eclipse.jface.text.presentation.PresentationReconciler;
import org.eclipse.jface.text.rules.DefaultDamagerRepairer;
import org.eclipse.jface.text.source.ISharedTextColors;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.text.source.SourceViewerConfiguration;

/**
 * @author balazs.grill
 *
 */
public class TextualModelSourceViewerConfiguration extends
		SourceViewerConfiguration {

	private final AbstractTextualResource resource;
	private final ISharedTextColors sharedColors;
	
	/**
	 * 
	 */
	public TextualModelSourceViewerConfiguration(AbstractTextualResource resource, ISharedTextColors sharedColors) {
		this.resource = resource;
		this.sharedColors = sharedColors;
	}

	@Override
	public IPresentationReconciler getPresentationReconciler(
			ISourceViewer sourceViewer) {
		PresentationReconciler reconciler = new PresentationReconciler();

        DefaultDamagerRepairer dr = new DefaultDamagerRepairer(new GrammarBasedTokenScanner(resource.getTokenizer(), sharedColors));
        reconciler.setDamager(dr, IDocument.DEFAULT_CONTENT_TYPE);
        reconciler.setRepairer(dr, IDocument.DEFAULT_CONTENT_TYPE);
        
        return reconciler;
	}
	
	 public IContentAssistant getContentAssistant(ISourceViewer sourceViewer)
	    {

	        ContentAssistant assistant = new ContentAssistant();

	        assistant.setContentAssistProcessor(new FeatureResolverBasedContenAssistProcessor(resource), IDocument.DEFAULT_CONTENT_TYPE);
	        assistant.enableAutoActivation(false);
	        assistant.setProposalPopupOrientation(IContentAssistant.CONTEXT_INFO_BELOW);
	        assistant.setContextInformationPopupOrientation(IContentAssistant.CONTEXT_INFO_BELOW);
	        return assistant;

	    }
	
}
