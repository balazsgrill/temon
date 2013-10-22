/**
 */
package hu.textualmodeler.grammar.scope.provider;


import hu.textualmodeler.grammar.scope.ScopeFactory;
import hu.textualmodeler.grammar.scope.ScopePackage;
import hu.textualmodeler.grammar.scope.TransitiveScope;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link hu.textualmodeler.grammar.scope.TransitiveScope} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TransitiveScopeItemProvider
	extends ScopeItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitiveScopeItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addOptionalPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Optional feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOptionalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TransitiveScope_optional_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TransitiveScope_optional_feature", "_UI_TransitiveScope_type"),
				 ScopePackage.Literals.TRANSITIVE_SCOPE__OPTIONAL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ScopePackage.Literals.TRANSITIVE_SCOPE__SUB_SCOPE);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns TransitiveScope.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TransitiveScope"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		TransitiveScope transitiveScope = (TransitiveScope)object;
		return getString("_UI_TransitiveScope_type") + " " + transitiveScope.isOptional();
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(TransitiveScope.class)) {
			case ScopePackage.TRANSITIVE_SCOPE__OPTIONAL:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ScopePackage.TRANSITIVE_SCOPE__SUB_SCOPE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(ScopePackage.Literals.TRANSITIVE_SCOPE__SUB_SCOPE,
				 ScopeFactory.eINSTANCE.createFeatureScope()));

		newChildDescriptors.add
			(createChildParameter
				(ScopePackage.Literals.TRANSITIVE_SCOPE__SUB_SCOPE,
				 ScopeFactory.eINSTANCE.createContainerScope()));

		newChildDescriptors.add
			(createChildParameter
				(ScopePackage.Literals.TRANSITIVE_SCOPE__SUB_SCOPE,
				 ScopeFactory.eINSTANCE.createTransitiveScope()));

		newChildDescriptors.add
			(createChildParameter
				(ScopePackage.Literals.TRANSITIVE_SCOPE__SUB_SCOPE,
				 ScopeFactory.eINSTANCE.createChainedScope()));

		newChildDescriptors.add
			(createChildParameter
				(ScopePackage.Literals.TRANSITIVE_SCOPE__SUB_SCOPE,
				 ScopeFactory.eINSTANCE.createConditionalScope()));

		newChildDescriptors.add
			(createChildParameter
				(ScopePackage.Literals.TRANSITIVE_SCOPE__SUB_SCOPE,
				 ScopeFactory.eINSTANCE.createGlobalScope()));

		newChildDescriptors.add
			(createChildParameter
				(ScopePackage.Literals.TRANSITIVE_SCOPE__SUB_SCOPE,
				 ScopeFactory.eINSTANCE.createUnionScope()));
	}

}
