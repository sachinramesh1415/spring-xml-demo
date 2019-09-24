package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.SimpleBeanDefinitionRegistry;
import org.springframework.beans.factory.xml.ResourceEntityResolver;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main
{
    public static void main( String[] args )
    {
        XmlBeanFactory factory = new XmlBeanFactory (new ClassPathResource("beans.xml"));
        Movie mov = factory.getBean("movie", Movie.class);
        mov.display();
        BeanDefinitionRegistry registry = new XmlBeanFactory(new ClassPathResource("beans.xml"));
        BeanDefinitionReader reader = new XmlBeanDefinitionReader(registry);
        BeanFactory factory1 = (BeanFactory) reader.getRegistry();
        Movie mov1 = factory1.getBean("movie", Movie.class);
        mov1.display();
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Movie mov2 = context.getBean("movie",Movie.class);
        mov2.display();
    }
}
