package com.springcore.springexpressionlanguage;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;


public class Test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/springexpressionlanguage/spelconfig.xml");
		Demo d1 = con.getBean("demo",Demo.class);
		System.out.println(d1);
		
		SpelExpressionParser temp = new SpelExpressionParser();
		 Expression expression =temp.parseExpression("222+32");
		 System.out.println(expression.getValue());
		
		
	}

}



/*
 How to invoke static method and variable in Spring
 
 T(class).method(param)
 T(class).variable
 
 We can create 
 */

//Notes

/*
 * In the Spring Framework, a `@Component` is one of the several stereotype annotations used to define and identify Spring beans. Spring beans are the core components managed by the Spring IoC (Inversion of Control) container. The `@Component` annotation is a generic stereotype for any Spring-managed component, and it is typically used to annotate Java classes to indicate that they should be managed as Spring beans.

Here's how you can use the `@Component` annotation:

1. Annotate a class with `@Component`:

```java
import org.springframework.stereotype.Component;

@Component
public class MyComponent {
    // Class code here
}
```

2. Make sure that the class is within the component scan base package or subpackages of your Spring application. Spring will automatically discover and manage the components annotated with `@Component`.

3. You can then use the Spring IoC container to inject instances of this component into other classes or components.

For example, if you have a class that depends on the `MyComponent` class, you can inject it like this:

```java
import org.springframework.beans.factory.annotation.Autowired;

public class AnotherComponent {
    private MyComponent myComponent;

    @Autowired
    public AnotherComponent(MyComponent myComponent) {
        this.myComponent = myComponent;
    }

    // Rest of the class
}
```

The Spring IoC container will automatically create and manage instances of `MyComponent` and inject them into instances of `AnotherComponent`.

The `@Component` annotation is just one of the stereotype annotations provided by Spring. There are others like `@Service`, `@Repository`, and `@Controller`, which are specialized versions of `@Component` and are often used to indicate the role of a particular bean in the application (e.g., service classes, repository classes, and controller classes). However, they all ultimately serve the same purpose of defining Spring-managed components.


Spring Expression Language (SpEL) is a powerful and flexible expression language used in the Spring Framework for various purposes, including configuration, data manipulation, and conditional expressions. SpEL is widely used in Spring for a variety of tasks. Here are some common uses of SpEL in Spring:

1. **Value Injection**: SpEL can be used to inject property values into Spring beans. This is often done using the `@Value` annotation or in XML configuration files.

   ```java
   @Value("#{myConfig.property}")
   private String someProperty;
   ```

   In XML configuration:

   ```xml
   <bean id="myBean" class="com.example.MyBean">
       <property name="name" value="#{ systemProperties['user.name'] }"/>
   </bean>
   ```

2. **Conditional Bean Definition**: SpEL can be used to conditionally create Spring beans based on runtime conditions.

   ```xml
   <bean id="myBean" class="com.example.MyBean" />
   <bean id="conditionalBean" class="com.example.ConditionalBean"
        c:condition="#{ myBean.threshold > 10 }" />
   ```

3. **Bean References**: SpEL can be used to reference other beans in your Spring configuration, making it possible to inject one bean into another.

   ```xml
   <bean id="beanA" class="com.example.BeanA" />
   <bean id="beanB" class="com.example.BeanB" />
   <bean id="beanC" class="com.example.BeanC" />
   <property name="dependentBean" value="#{ beanA }" />
   ```

4. **Collection Manipulation**: SpEL supports operations on collections, allowing you to filter, transform, and manipulate collections of data in your Spring configuration.

   ```xml
   <util:map id="myMap" key-type="java.lang.String" value-type="java.lang.String">
       <entry key="key1" value="value1" />
       <entry key="key2" value="value2" />
   </util:map>
   <property name="filteredMap" value="#{ myMap.?[value.startsWith('v')] }" />
   ```

5. **Method Invocation**: You can use SpEL to call methods on objects and beans in your Spring application.

   ```xml
   <bean id="mathOperations" class="com.example.MathOperations">
       <property name="multiplier" value="2" />
   </bean>
   <property name="result" value="#{ mathOperations.multiply(5) }" />
   ```

6. **Conditional Expressions**: SpEL can be used to define conditional expressions within your configuration, allowing you to conditionally include or exclude certain beans based on runtime conditions.

   ```xml
   <beans>
       <bean id="myBean" class="com.example.MyBean" />
       <bean id="conditionalBean" class="com.example.ConditionalBean" depends-on="myBean" 
           c:condition="#{ myBean.threshold > 10 }" />
   </beans>
   ```

SpEL enhances the flexibility and expressiveness of your Spring applications by allowing you to work with dynamic data and expressions within your configuration and code. It's a valuable tool for creating more configurable and dynamic Spring applications.
 */
