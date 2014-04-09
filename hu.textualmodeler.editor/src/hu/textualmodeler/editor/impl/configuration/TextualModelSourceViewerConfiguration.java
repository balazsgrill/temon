/**
 * 
 */
package hu.textualmodeler.editor.impl.configuration;

import hu.textualmodeler.parser.impl.Tokenizer;

import org.eclipse.jface.text.IDocument;
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

	private final Tokenizer tokenizer;
	private final ISharedTextColors sharedColors;
	
	/**
	 * 
	 */
	public TextualModelSourceViewerConfiguration(Tokenizer tokenizer, ISharedTextColors sharedColors) {
		this.tokenizer = tokenizer;
		this.sharedColors = sharedColors;
	}

	@Override
	public IPresentationReconciler getPresentationReconciler(
			ISourceViewer sourceViewer) {
		PresentationReconciler reconciler = new PresentationReconciler();

        DefaultDamagerRepairer dr = new DefaultDamagerRepairer(new GrammarBasedTokenScanner(tokenizer, sharedColors));
        reconciler.setDamager(dr, IDocument.DEFAULT_CONTENT_TYPE);
        reconciler.setRepairer(dr, IDocument.DEFAULT_CONTENT_TYPE);
        
        return reconciler;
	}
	
}
