package com.example;

import com.marsluo.ba01.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest01 {

    @Test
    public void test02() {
        String config = "ba01/ApplicationContext.xml";

        ApplicationContext context = new ClassPathXmlApplicationContext(config);

        Student myStudent = (Student) context.getBean("myStudent");
        System.out.println("Student 对象："+myStudent);
    }
}
