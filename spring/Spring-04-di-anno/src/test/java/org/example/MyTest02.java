package org.example;

import org.example.ba02.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest02 {

    @Test
    public void test01() {
        String config = "applicationContext-02.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(config);

        Student student = (Student) context.getBean("myStudent");

        System.out.println(student);
    }
}
