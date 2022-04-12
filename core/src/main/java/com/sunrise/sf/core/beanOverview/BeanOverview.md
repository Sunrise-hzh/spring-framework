###Bean Overview —— bean概述
Spring IoC容器管理着许多bean。这些bean是根据提供给IoC容器的配置元数据（如xml）来创建的。  
在容器内部，这些bean定义的信息被表现为一个个 *BeanDefinition* 对象，其包含以下信息：
1. 全限定类名；
2. Bean行为配置元素，它声明Bean在容器中应该如何行为(作用域、生命周期回调等等)；
3. 对其他bean的引用，这些bean需要引用其他bean来完成它的工作。这些引用也称为协作者或依赖关系dependencies。
4. 在实例化对象时给这些bean设置的其他属性。例如，pool的大小限制或在管理连接池的bean中使用的连接数量。

Spring还支持将外部创建的bean注册到容器里面，通过 *getBeanFactory()* 方法获取Bean工厂 *DefaultListableBeanFactory* ，其会提供 *registerSingleton(..)* and *registerBeanDefinition(..)* methods两个方法。

###Naming Beans —— 命名bean
可以给bean设置别名，具体查阅官方文档。

###Instantiating Beans —— 实例化bean
有三种方式： 构造器、静态工厂方法、工厂类的方法。
详情参考官方文档，例子参考 *beanOverview.xml* 配置文件。