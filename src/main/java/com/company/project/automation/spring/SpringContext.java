
package com.company.project.automation.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringContext {
    private static ApplicationContext context;
    public static void init() {
        context = new AnnotationConfigApplicationContext("com.company.project.automation");
    }
    public static <T> T getBean(Class<T> cls) {
        return context.getBean(cls);
    }
}
