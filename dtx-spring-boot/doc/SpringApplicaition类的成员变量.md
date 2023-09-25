```java
public class SpringApplication {
    /**
     * Default banner location.
     */
    public static final String BANNER_LOCATION_PROPERTY_VALUE = SpringApplicationBannerPrinter.DEFAULT_BANNER_LOCATION;

    /**
     * Banner location property key.
     */
    public static final String BANNER_LOCATION_PROPERTY = SpringApplicationBannerPrinter.BANNER_LOCATION_PROPERTY;

    private static final String SYSTEM_PROPERTY_JAVA_AWT_HEADLESS = "java.awt.headless";

    private static final Log logger = LogFactory.getLog(SpringApplication.class);

    static final SpringApplicationShutdownHook shutdownHook = new SpringApplicationShutdownHook();

    private Set<Class<?>> primarySources;

    private Set<String> sources = new LinkedHashSet<>();

    private Class<?> mainApplicationClass;

    private Banner.Mode bannerMode = Banner.Mode.CONSOLE;

    private boolean logStartupInfo = true;

    private boolean addCommandLineProperties = true;

    private boolean addConversionService = true;

    private Banner banner;

    private ResourceLoader resourceLoader;

    private BeanNameGenerator beanNameGenerator;

    private ConfigurableEnvironment environment;

    private WebApplicationType webApplicationType;

    private boolean headless = true;

    private boolean registerShutdownHook = true;

    private List<ApplicationContextInitializer<?>> initializers;

    private List<ApplicationListener<?>> listeners;

    private Map<String, Object> defaultProperties;

    private List<BootstrapRegistryInitializer> bootstrapRegistryInitializers;

    private Set<String> additionalProfiles = Collections.emptySet();

    private boolean allowBeanDefinitionOverriding;

    private boolean allowCircularReferences;

    private boolean isCustomEnvironment = false;

    private boolean lazyInitialization = false;

    private String environmentPrefix;

    private ApplicationContextFactory applicationContextFactory = ApplicationContextFactory.DEFAULT;

    private ApplicationStartup applicationStartup = ApplicationStartup.DEFAULT;
}
```