/**
 */
package adaptorinterface.provider;

import adaptorinterface.util.AdaptorinterfaceAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AdaptorinterfaceItemProviderAdapterFactory extends AdaptorinterfaceAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdaptorinterfaceItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link adaptorinterface.AdaptorInterface} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdaptorInterfaceItemProvider adaptorInterfaceItemProvider;

	/**
	 * This creates an adapter for a {@link adaptorinterface.AdaptorInterface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAdaptorInterfaceAdapter() {
		if (adaptorInterfaceItemProvider == null) {
			adaptorInterfaceItemProvider = new AdaptorInterfaceItemProvider(this);
		}

		return adaptorInterfaceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link adaptorinterface.Specification} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecificationItemProvider specificationItemProvider;

	/**
	 * This creates an adapter for a {@link adaptorinterface.Specification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSpecificationAdapter() {
		if (specificationItemProvider == null) {
			specificationItemProvider = new SpecificationItemProvider(this);
		}

		return specificationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link adaptorinterface.DomainSpecification} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainSpecificationItemProvider domainSpecificationItemProvider;

	/**
	 * This creates an adapter for a {@link adaptorinterface.DomainSpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDomainSpecificationAdapter() {
		if (domainSpecificationItemProvider == null) {
			domainSpecificationItemProvider = new DomainSpecificationItemProvider(this);
		}

		return domainSpecificationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link adaptorinterface.NamespacePrefix} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamespacePrefixItemProvider namespacePrefixItemProvider;

	/**
	 * This creates an adapter for a {@link adaptorinterface.NamespacePrefix}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNamespacePrefixAdapter() {
		if (namespacePrefixItemProvider == null) {
			namespacePrefixItemProvider = new NamespacePrefixItemProvider(this);
		}

		return namespacePrefixItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link adaptorinterface.ServiceProviderCatalog} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceProviderCatalogItemProvider serviceProviderCatalogItemProvider;

	/**
	 * This creates an adapter for a {@link adaptorinterface.ServiceProviderCatalog}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createServiceProviderCatalogAdapter() {
		if (serviceProviderCatalogItemProvider == null) {
			serviceProviderCatalogItemProvider = new ServiceProviderCatalogItemProvider(this);
		}

		return serviceProviderCatalogItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link adaptorinterface.ServiceProvider} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceProviderItemProvider serviceProviderItemProvider;

	/**
	 * This creates an adapter for a {@link adaptorinterface.ServiceProvider}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createServiceProviderAdapter() {
		if (serviceProviderItemProvider == null) {
			serviceProviderItemProvider = new ServiceProviderItemProvider(this);
		}

		return serviceProviderItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link adaptorinterface.Service} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceItemProvider serviceItemProvider;

	/**
	 * This creates an adapter for a {@link adaptorinterface.Service}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createServiceAdapter() {
		if (serviceItemProvider == null) {
			serviceItemProvider = new ServiceItemProvider(this);
		}

		return serviceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link adaptorinterface.Resource} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceItemProvider resourceItemProvider;

	/**
	 * This creates an adapter for a {@link adaptorinterface.Resource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createResourceAdapter() {
		if (resourceItemProvider == null) {
			resourceItemProvider = new ResourceItemProvider(this);
		}

		return resourceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link adaptorinterface.ResourceProperty} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourcePropertyItemProvider resourcePropertyItemProvider;

	/**
	 * This creates an adapter for a {@link adaptorinterface.ResourceProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createResourcePropertyAdapter() {
		if (resourcePropertyItemProvider == null) {
			resourcePropertyItemProvider = new ResourcePropertyItemProvider(this);
		}

		return resourcePropertyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link adaptorinterface.CreationFactory} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreationFactoryItemProvider creationFactoryItemProvider;

	/**
	 * This creates an adapter for a {@link adaptorinterface.CreationFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCreationFactoryAdapter() {
		if (creationFactoryItemProvider == null) {
			creationFactoryItemProvider = new CreationFactoryItemProvider(this);
		}

		return creationFactoryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link adaptorinterface.QueryCapability} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueryCapabilityItemProvider queryCapabilityItemProvider;

	/**
	 * This creates an adapter for a {@link adaptorinterface.QueryCapability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createQueryCapabilityAdapter() {
		if (queryCapabilityItemProvider == null) {
			queryCapabilityItemProvider = new QueryCapabilityItemProvider(this);
		}

		return queryCapabilityItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link adaptorinterface.BasicCapability} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BasicCapabilityItemProvider basicCapabilityItemProvider;

	/**
	 * This creates an adapter for a {@link adaptorinterface.BasicCapability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBasicCapabilityAdapter() {
		if (basicCapabilityItemProvider == null) {
			basicCapabilityItemProvider = new BasicCapabilityItemProvider(this);
		}

		return basicCapabilityItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link adaptorinterface.Dialog} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DialogItemProvider dialogItemProvider;

	/**
	 * This creates an adapter for a {@link adaptorinterface.Dialog}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDialogAdapter() {
		if (dialogItemProvider == null) {
			dialogItemProvider = new DialogItemProvider(this);
		}

		return dialogItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link adaptorinterface.Publisher} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PublisherItemProvider publisherItemProvider;

	/**
	 * This creates an adapter for a {@link adaptorinterface.Publisher}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPublisherAdapter() {
		if (publisherItemProvider == null) {
			publisherItemProvider = new PublisherItemProvider(this);
		}

		return publisherItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link adaptorinterface.GenericRequiredAdaptor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenericRequiredAdaptorItemProvider genericRequiredAdaptorItemProvider;

	/**
	 * This creates an adapter for a {@link adaptorinterface.GenericRequiredAdaptor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGenericRequiredAdaptorAdapter() {
		if (genericRequiredAdaptorItemProvider == null) {
			genericRequiredAdaptorItemProvider = new GenericRequiredAdaptorItemProvider(this);
		}

		return genericRequiredAdaptorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link adaptorinterface.ModelledRequiredAdaptor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelledRequiredAdaptorItemProvider modelledRequiredAdaptorItemProvider;

	/**
	 * This creates an adapter for a {@link adaptorinterface.ModelledRequiredAdaptor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModelledRequiredAdaptorAdapter() {
		if (modelledRequiredAdaptorItemProvider == null) {
			modelledRequiredAdaptorItemProvider = new ModelledRequiredAdaptorItemProvider(this);
		}

		return modelledRequiredAdaptorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link adaptorinterface.GenerationSetting} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenerationSettingItemProvider generationSettingItemProvider;

	/**
	 * This creates an adapter for a {@link adaptorinterface.GenerationSetting}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGenerationSettingAdapter() {
		if (generationSettingItemProvider == null) {
			generationSettingItemProvider = new GenerationSettingItemProvider(this);
		}

		return generationSettingItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link adaptorinterface.ShaclShape} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShaclShapeItemProvider shaclShapeItemProvider;

	/**
	 * This creates an adapter for a {@link adaptorinterface.ShaclShape}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createShaclShapeAdapter() {
		if (shaclShapeItemProvider == null) {
			shaclShapeItemProvider = new ShaclShapeItemProvider(this);
		}

		return shaclShapeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link adaptorinterface.ShapeProperty} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShapePropertyItemProvider shapePropertyItemProvider;

	/**
	 * This creates an adapter for a {@link adaptorinterface.ShapeProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createShapePropertyAdapter() {
		if (shapePropertyItemProvider == null) {
			shapePropertyItemProvider = new ShapePropertyItemProvider(this);
		}

		return shapePropertyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link adaptorinterface.ShaclProperty} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShaclPropertyItemProvider shaclPropertyItemProvider;

	/**
	 * This creates an adapter for a {@link adaptorinterface.ShaclProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createShaclPropertyAdapter() {
		if (shaclPropertyItemProvider == null) {
			shaclPropertyItemProvider = new ShaclPropertyItemProvider(this);
		}

		return shaclPropertyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link adaptorinterface.GeneralConfiguration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneralConfigurationItemProvider generalConfigurationItemProvider;

	/**
	 * This creates an adapter for a {@link adaptorinterface.GeneralConfiguration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGeneralConfigurationAdapter() {
		if (generalConfigurationItemProvider == null) {
			generalConfigurationItemProvider = new GeneralConfigurationItemProvider(this);
		}

		return generalConfigurationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link adaptorinterface.ProjectConfiguration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectConfigurationItemProvider projectConfigurationItemProvider;

	/**
	 * This creates an adapter for a {@link adaptorinterface.ProjectConfiguration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProjectConfigurationAdapter() {
		if (projectConfigurationItemProvider == null) {
			projectConfigurationItemProvider = new ProjectConfigurationItemProvider(this);
		}

		return projectConfigurationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link adaptorinterface.ServerConfiguration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServerConfigurationItemProvider serverConfigurationItemProvider;

	/**
	 * This creates an adapter for a {@link adaptorinterface.ServerConfiguration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createServerConfigurationAdapter() {
		if (serverConfigurationItemProvider == null) {
			serverConfigurationItemProvider = new ServerConfigurationItemProvider(this);
		}

		return serverConfigurationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link adaptorinterface.MavenProjectConfiguration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MavenProjectConfigurationItemProvider mavenProjectConfigurationItemProvider;

	/**
	 * This creates an adapter for a {@link adaptorinterface.MavenProjectConfiguration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMavenProjectConfigurationAdapter() {
		if (mavenProjectConfigurationItemProvider == null) {
			mavenProjectConfigurationItemProvider = new MavenProjectConfigurationItemProvider(this);
		}

		return mavenProjectConfigurationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link adaptorinterface.MavenServerConfiguration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MavenServerConfigurationItemProvider mavenServerConfigurationItemProvider;

	/**
	 * This creates an adapter for a {@link adaptorinterface.MavenServerConfiguration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMavenServerConfigurationAdapter() {
		if (mavenServerConfigurationItemProvider == null) {
			mavenServerConfigurationItemProvider = new MavenServerConfigurationItemProvider(this);
		}

		return mavenServerConfigurationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link adaptorinterface.MavenSpecificationConfiguration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MavenSpecificationConfigurationItemProvider mavenSpecificationConfigurationItemProvider;

	/**
	 * This creates an adapter for a {@link adaptorinterface.MavenSpecificationConfiguration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMavenSpecificationConfigurationAdapter() {
		if (mavenSpecificationConfigurationItemProvider == null) {
			mavenSpecificationConfigurationItemProvider = new MavenSpecificationConfigurationItemProvider(this);
		}

		return mavenSpecificationConfigurationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link adaptorinterface.WebService} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WebServiceItemProvider webServiceItemProvider;

	/**
	 * This creates an adapter for a {@link adaptorinterface.WebService}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWebServiceAdapter() {
		if (webServiceItemProvider == null) {
			webServiceItemProvider = new WebServiceItemProvider(this);
		}

		return webServiceItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose() {
		if (adaptorInterfaceItemProvider != null) adaptorInterfaceItemProvider.dispose();
		if (specificationItemProvider != null) specificationItemProvider.dispose();
		if (domainSpecificationItemProvider != null) domainSpecificationItemProvider.dispose();
		if (namespacePrefixItemProvider != null) namespacePrefixItemProvider.dispose();
		if (serviceProviderCatalogItemProvider != null) serviceProviderCatalogItemProvider.dispose();
		if (serviceProviderItemProvider != null) serviceProviderItemProvider.dispose();
		if (serviceItemProvider != null) serviceItemProvider.dispose();
		if (webServiceItemProvider != null) webServiceItemProvider.dispose();
		if (resourceItemProvider != null) resourceItemProvider.dispose();
		if (resourcePropertyItemProvider != null) resourcePropertyItemProvider.dispose();
		if (creationFactoryItemProvider != null) creationFactoryItemProvider.dispose();
		if (queryCapabilityItemProvider != null) queryCapabilityItemProvider.dispose();
		if (basicCapabilityItemProvider != null) basicCapabilityItemProvider.dispose();
		if (dialogItemProvider != null) dialogItemProvider.dispose();
		if (publisherItemProvider != null) publisherItemProvider.dispose();
		if (genericRequiredAdaptorItemProvider != null) genericRequiredAdaptorItemProvider.dispose();
		if (modelledRequiredAdaptorItemProvider != null) modelledRequiredAdaptorItemProvider.dispose();
		if (generationSettingItemProvider != null) generationSettingItemProvider.dispose();
		if (shaclShapeItemProvider != null) shaclShapeItemProvider.dispose();
		if (shapePropertyItemProvider != null) shapePropertyItemProvider.dispose();
		if (shaclPropertyItemProvider != null) shaclPropertyItemProvider.dispose();
		if (generalConfigurationItemProvider != null) generalConfigurationItemProvider.dispose();
		if (projectConfigurationItemProvider != null) projectConfigurationItemProvider.dispose();
		if (serverConfigurationItemProvider != null) serverConfigurationItemProvider.dispose();
		if (mavenProjectConfigurationItemProvider != null) mavenProjectConfigurationItemProvider.dispose();
		if (mavenServerConfigurationItemProvider != null) mavenServerConfigurationItemProvider.dispose();
		if (mavenSpecificationConfigurationItemProvider != null) mavenSpecificationConfigurationItemProvider.dispose();
	}

}
