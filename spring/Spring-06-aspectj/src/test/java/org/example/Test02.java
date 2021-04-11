package org.example;

import org.example.ba02.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test02 {

    @Test
    public void tese01() {
        String config = "applicationContext-02.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(config);
        SomeService proxy = (SomeService) context.getBean("someService");

        proxy.doSome("lizi", 25);
    }
}
