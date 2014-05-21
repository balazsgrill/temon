/**
 * 
 */
package hu.temon.sdk;

import hu.temon.parser.grammar.GrammarRegistry;
import hu.temon.parser.scope.IScopeElement;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.pde.core.plugin.IExtensions;
import org.eclipse.pde.core.plugin.IPluginAttribute;
import org.eclipse.pde.core.plugin.IPluginElement;
import org.eclipse.pde.core.plugin.IPluginExtension;
import org.eclipse.pde.core.plugin.IPluginModelBase;
import org.eclipse.pde.core.plugin.IPluginObject;

/**
 * @author balazs.grill
 *
 */
public class PluginGrammarScope extends AbstractPluginBasedScope<PluginGrammarScope> {
	
	/**
	 * 
	 */
	public PluginGrammarScope(IPluginModelBase...plugins) {
		super(plugins);
	}

	@Override
	protected Collection<IScopeElement> getElements(IPluginModelBase plugin) {
		List<IScopeElement> elements = new LinkedList<>();

		IExtensions ext = plugin.getExtensions();
		if (ext != null){
			for(IPluginExtension pe : ext.getExtensions()){
				if (GrammarRegistry.EPID.equals(pe.getPoint())){
					for(IPluginObject po : pe.getChildren()){
						if (po instanceof IPluginElement){
							if (GrammarRegistry.ELEMENT_GRAMMAR.equals(po.getName())){
								IPluginAttribute id = ((IPluginElement)po).getAttribute(GrammarRegistry.ATTR_ID);
								IPluginAttribute path = ((IPluginElement)po).getAttribute(GrammarRegistry.ATTR_PATH);
								if (id != null && path != null){
									elements.add(new RegisteredGrammarElement(plugin, id.getValue(), path.getValue()));
								}
							}
						}
					}
				}
			}
		}

		return elements;
	}
	
	@Override
	protected PluginGrammarScope createParentScope(IPluginModelBase... plugins) {
		return new PluginGrammarScope(plugins);
	}


}
