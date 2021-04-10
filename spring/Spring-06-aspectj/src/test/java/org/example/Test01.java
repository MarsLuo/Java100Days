package org.example;

import org.example.ba01.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {

    @Test
    public void tese01() {
        String config = "applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(config);
        SomeService proxy = (SomeService) context.getBean("someService");

        proxy.doSome("lizi", 25);
    }
}
