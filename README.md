# AOP Example based on book "Pro Spring 5"

This example show how implements AOP. A simple java class with a simple method wich his actual behavior was 'improved' using a 'aspect'. 


At first we have a simple Agent class wich print "Bond", after that we have a AgentDecorator class wich implements MethodInterceptor and override invoke method. At last we have the AgentAOPDemo wich use ProxyFactory where we can, programatically allow Spring AOP make his magic! 

## technologies
- Java
- Eclipse
- Maven
- Spring Framework

## how to buid

```$ mvn clean install```

```$ mvn spring-boot:run```
