package com.example;

import com.example.service.SomeService;
import com.example.service.imp.SomeServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {


    @Test
    public void test01() {
        SomeService service = new SomeServiceImpl();
        service.doSome();
    }

    @Test
    public void test02() {
        String config = "beans.xml";

        ApplicationContext context = new ClassPathXmlApplicationContext(config);

        SomeService ss = (SomeService) context.getBean("someService");
        ss.doSome();
    }
}
