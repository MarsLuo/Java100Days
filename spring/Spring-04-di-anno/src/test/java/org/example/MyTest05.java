package org.example;

import org.example.ba05.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest05 {

    @Test
    public void test01() {
        String config = "applicationContext-05.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(config);

        Student student = (Student) context.getBean("myStudent");

        System.out.println(student);
    }
}
