package org.example;

import org.example.ba04.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class Test04 {

    @Test
    public void tese01() {
        String config = "applicationContext-04.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(config);
        SomeService proxy = (SomeService) context.getBean("someService");

        Object result = proxy.doFirst("Mars", 12);
        System.out.println("result = "+ result);

    }
}
