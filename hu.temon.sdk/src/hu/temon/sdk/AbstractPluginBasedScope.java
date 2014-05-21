/**
 * 
 */
package hu.temon.sdk;

import java.io.File;
import java.net.URI;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import hu.temon.parser.scope.AbstractScope;
import hu.temon.parser.scope.IFeatureScope;
import hu.temon.parser.scope.IScopeElement;

import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.URIUtil;
import org.eclipse.osgi.service.resolver.BundleSpecification;
import org.eclipse.pde.core.plugin.IPluginModelBase;
import org.eclipse.pde.core.plugin.PluginRegistry;

/**
 * @author balazs.grill
 *
 */
public abstract class AbstractPluginBasedScope<T extends AbstractPluginBasedScope<T>> extends AbstractScope {

	public static URI getResouceURI(IPluginModelBase modelBase, String path){
		String loc = modelBase.getInstallLocation();
		File file = new File(loc);
		URI uri = file.toURI();
		if (URIUtil.isFileURI(uri)){
			return URIUtil.append(uri, path);
		}
		if ("jar".equals(uri.getScheme())){
			return URIUtil.toJarURI(uri, new Path(path));
		}
		return null;
	}
	
	protected final IPluginModelBase[] plugins;
	
	/**
	 * 
	 */
	public AbstractPluginBasedScope(IPluginModelBase...plugins) {
		this.plugins = plugins;
	}

	protected abstract T createParentScope(IPluginModelBase...plugins);
	
	/* (non-Javadoc)
	 * @see hu.temon.parser.scope.IFeatureScope#parentScope()
	 */
	@Override
	public IFeatureScope parentScope() {
		Set<IPluginModelBase> current = new HashSet<>(Arrays.asList(plugins));
		Set<IPluginModelBase> deps = new LinkedHashSet<>();
		
		for(IPluginModelBase plugin : plugins){
			BundleSpecification[] specs = plugin.getBundleDescription().getRequiredBundles();
			for(BundleSpecification spec : specs){
				IPluginModelBase dep = PluginRegistry.findModel(spec.getName());
				if (!current.contains(dep)){
					deps.add(dep);
				}
			}
		}
		
		return deps.isEmpty() ? null : createParentScope(deps.toArray(new IPluginModelBase[deps.size()]));
	}

	@Override
	public Collection<IScopeElement> getLocalElements() {
		List<IScopeElement> elements = new LinkedList<>();
		for(IPluginModelBase plugin : plugins){
			elements.addAll(getElements(plugin));
		}
		return elements;
	}
	
	protected abstract Collection<IScopeElement> getElements(IPluginModelBase plugin);
	
}
