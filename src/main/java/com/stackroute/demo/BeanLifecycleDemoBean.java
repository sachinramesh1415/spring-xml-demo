package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {
    private String message;
    public void setMessage(String message) {
        this.message = message;
    }
    public void customInit() {
        System.out.println("Custom Init message");
    }
    public void customDestroy() {
        System.out.println("Custom Destroy Message");
    }
    @Override
    public void destroy() throws Exception {
        System.out.println("Bean destroyed");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(message);
    }

}
