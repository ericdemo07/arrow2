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

    volatile boolean isLoad;

    private BackendInitiatorSingleton() {
    }

    public static BackendInitiatorSingleton getInstance() {
        if (instance == null) {
            instance = new BackendInitiatorSingleton();
        }
        return instance;
    }

    public ApplicationContext initialize() {

        ApplicationContext cxt = new ClassPathXmlApplicationContext("spring-config.xml");
        return cxt;
    }
}
