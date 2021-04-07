package org.example.ba03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// 完整写法
//@Component(value = "myStudent")
// 省略Value
@Component("myStudent")
// Spring 提供默认名称
//@Component
public class Student {

    @Value("张飞")
    private String name;
    @Value("12")
    private Integer age;
    @Autowired
    private School school;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }
}
