package com.arcesium.Service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBeanExtension {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Parent parent = applicationContext.getBean(Parent.class);
        parent.printMyFamily();

        Child child = applicationContext.getBean(Child.class);
        child.printMyFamily();
    }
}
