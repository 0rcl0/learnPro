# learnPro

github first project


## Spring 学习

> Spring 扩展性强


aware --> 方便通过Spring中的bean对象来获取容器中的相关属性值

beanDefinition
beanFactoryPostProcessor
BeanFactory 的 JavaDOC 上有 bean 的生命周期

```java
/**
*   {@link org.springframework.beans.factory.BeanFactory} 
 *  {@link org.springframework.context.support.AbstractApplicationContext} 看懂这个源码就看懂了 Spring
*/
```

bean 的生命周期

实例化   开辟空间
填充属性
执行aware接口需要实现的方法 设置属性值
beanPostProcessor.before
init-method
beanPostProcessor.after


