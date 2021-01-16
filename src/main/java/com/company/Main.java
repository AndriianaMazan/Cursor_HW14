package com.company;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfig.class);

        Scheduler scheduler = applicationContext.getBean(Scheduler.class);
        scheduler.getCurrentTime();
    }
}
