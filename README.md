springboot框架的给我的感觉就是不用再导入jar包，而是使用pom文件来进行配置，使用了配置文件进行配置感觉简化了好多，使用起来进行比较方便，包括注解的方式进行配置。
第一天：springioc 
Di常见的方式一般使用构造器和Setter进行注入
说明了Bean的作用域Singleton
Bean的生命周期
Bean的初始化和销毁的三种方式
1,配置init-method,destroy-method
2,实现接口方法
3,注解的两种方式@PostConstruct、@PreDestroy
加入注解@ApplicationContext进行容器解析bean的过程
讲解了容器配置的几种方式，基于xml的容器配置，基于注解的容器配置，基于java的容器配置，个人感觉xml配置的方式，思路上比较清晰，能够一一的对应上，但是配置单额过程，代码量
较多，所以感觉有些繁琐，而注解的方式进行配置，比较简单，代码量也尤为的较少，但是理解起来有些还是不太容易，它的这个注解是怎么进行，声明的等等。个人总结，感觉还是把xml和注解的方式综合起来进行使用。这样可以提升代码的效率，以及节省一些不必要的空间。
常用的注解：
声明bean的注解
@Component
@Service,@Repository,@Controller....
注入Bean 的注解
@Autowired:进行自动注入参数和属性对应Bean
@Inject:进行注入
@Resource:用来装配Bean
@Required:注解作用于Beansetter方法上，用于检查一个Bean的属性的值在配置期间是否被赋予或设置
@Qualifier:设值注入&构造注入
@Primary:
@Named:
常用注解
配置类相关注解
@Configuration：用于定义配置类
@Bean:是一个方法级别上的注解
@ComponetScan：扫描注解
第二天
就是进行创建一个web项目，
并且如何启动它，如何运行它，运行springBoot 项目有三种方式
Ide运行
Jar包运行：java -jar
maven插件：mvn spring-boot:run 
还有一些启动类的定制
定制banner
CommandLiineRunner
ApplicationRunner
ApplicationListener
热部署：就是项目在更改类之后，点击保存，会自动的将服务进行重启。
Spring boot 配置文件
application属性文件
自定义属性
自定义配置文件
配置文件的优先级是由高到低的顺序
外部配置的优先级高于内部配置的优先级，也就是说，后配置的要覆盖掉之间配置的文件
lombok插件：用来简化代码，以及代码的规范程度，节省空间，提高效率，是一个不可多得的必备插件。
Profiles:用于定义项目中的Application.properies中的定义的spring中的属性，并且指定激活的active对应的属性值。
第三天：
SpringBoot日志
SLF4J--Simple Logging Facade For Java
SLF4J定义了统一的日志抽象接口，而真正的日志实现则是在运行时决定的--它提供了各类日志框架的binding。
常见日志框架
Commons logging(Spring框架内部日志使用)
java util logging
Log4J
Log4J2
Logback:效率更高，适应更多环境，支持SLF4J
日志的输出
1，输出到控制台
	默认情况下，SpringBoot 将日志输出到控制台
2，日志级别
	日志级别从低到高分别为trace<debug<info<warn<
