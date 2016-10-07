package com.arrow;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * This will load application context once in to memory
 * Is thread safe
 * Created by ayush.shukla on 9/29/2016.
 */
public class BackendInitiatorSingleton {
    private static BackendInitiatorSingleton instance;
    private static ApplicationContext cxt;
    volatile boolean isLoad;

    private BackendInitiatorSingleton() {
    }

    public static ApplicationContext getInstance() {
        if (instance == null) {
            instance = new BackendInitiatorSingleton();
            cxt = new ClassPathXmlApplicationContext("spring-config.xml");
        }
        return cxt;
    }

    public ApplicationContext initialize() {


        return cxt;
    }
}
