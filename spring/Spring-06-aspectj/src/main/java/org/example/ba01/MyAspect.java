package org.example.ba01;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.Date;

@Aspect
public class MyAspect {

    @Before(value = "execution(public void org.example.ba01.SomeServiceImpl.doSome(String, Integer))")
    public void myBefore() {
        System.out.println("new Date: "+ new Date());
    }

}
