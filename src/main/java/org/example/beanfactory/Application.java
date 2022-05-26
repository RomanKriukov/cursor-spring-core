package org.example.beanfactory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("bean-factory.xml");
        Employee employee = (Employee) beanFactory.getBean("employee");
        System.out.println("employee age : " + employee.getAge());
        System.out.println("employee name : " + employee.getName());
    }
}
