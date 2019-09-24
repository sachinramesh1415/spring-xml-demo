package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie implements ApplicationContextAware, BeanFactoryAware, BeanNameAware {
    private Actor actor;
    public Movie(Actor actor) {
        this.actor = actor;
    }

    public void display() {
        System.out.println("Actor: " + actor.getName());
        System.out.println("Gender: " + actor.getGender());
        System.out.println("Age: " + actor.getAge());
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Bean Factory: "+ beanFactory);
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Bean Name is " + s);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Application Context : " + applicationContext);
    }
}
