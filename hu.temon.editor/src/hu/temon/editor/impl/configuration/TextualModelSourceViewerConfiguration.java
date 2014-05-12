/**
 * 
 */
package hu.temon.editor.impl.configuration;

import hu.temon.editor.TextualModelEditor;

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

	private final TextualModelEditor editor;
	private final ISharedTextColors sharedColors;
	
	/**
	 * 
	 */
	public TextualModelSourceViewerConfiguration(TextualModelEditor editor, ISharedTextColors sharedColors) {
		this.editor = editor;
		this.sharedColors = sharedColors;
	}

	@Override
	public IPresentationReconciler getPresentationReconciler(
			ISourceViewer sourceViewer) {
		PresentationReconciler reconciler = new PresentationReconciler();

        DefaultDamagerRepairer dr = new DefaultDamagerRepairer(new GrammarBasedTokenScanner(editor.getResource().getTokenizer(), sharedColors));
        reconciler.setDamager(dr, IDocument.DEFAULT_CONTENT_TYPE);
        reconciler.setRepairer(dr, IDocument.DEFAULT_CONTENT_TYPE);
        
        return reconciler;
	}
	
	 public IContentAssistant getContentAssistant(ISourceViewer sourceViewer)
	    {

	        ContentAssistant assistant = new ContentAssistant();

	        assistant.setContentAssistProcessor(new FeatureResolverBasedContenAssistProcessor(editor), IDocument.DEFAULT_CONTENT_TYPE);
	        assistant.enableAutoActivation(false);
	        assistant.setProposalPopupOrientation(IContentAssistant.CONTEXT_INFO_BELOW);
	        assistant.setContextInformationPopupOrientation(IContentAssistant.CONTEXT_INFO_BELOW);
	        return assistant;

	    }
	
}
