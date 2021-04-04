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

    @Test
    public void test03(){
        String config = "beans.xml";

        ApplicationContext context = new ClassPathXmlApplicationContext(config);

        int numbers = context.getBeanDefinitionCount();
        System.out.println("容器中对象的数量："+numbers);

        String[] names = context.getBeanDefinitionNames();
        for (String name: names) {
            System.out.println("容器中对象的名称："+name);
        } 
    }
}
