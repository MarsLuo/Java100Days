package org.example.ba06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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

    /*
    * 从Spring Framework 5.1开始，@Required注解正式被弃用，取而代之的是使用构造函数注入用于所需的属性
    * 或使用InitializingBean.afterPropertiesSet（）的自定义实现以及bean属性setter方法。
    * */
    public Student(School school) {
        this.school = school;
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
