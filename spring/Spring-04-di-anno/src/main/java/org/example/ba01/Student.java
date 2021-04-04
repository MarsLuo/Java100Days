package org.example.ba01;

import org.springframework.stereotype.Component;

// 完整写法
//@Component(value = "myStudent")
// 省略Value
@Component("myStudent")
// Spring 提供默认名称
//@Component
public class Student {

    private String name;
    private Integer age;

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
                '}';
    }
}
