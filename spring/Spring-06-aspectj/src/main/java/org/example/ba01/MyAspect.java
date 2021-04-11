package org.example.ba01;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.Date;

@Aspect
public class MyAspect {

//    @Before(value = "execution(public void org.example.ba01.SomeServiceImpl.doSome(String, Integer))")
//    public void myBefore() {
//        System.out.println("new Date: "+ new Date());
//    }

    @Before(value = "execution(public void org.example.ba01.SomeServiceImpl.doSome(String, Integer))")
    public void myBefore(JoinPoint jp)  {
        System.out.println("Signature: "+jp.getSignature());
        System.out.println("method name:"+jp.getSignature().getName());

        Object args [] = jp.getArgs();
        for (Object arg : args) {
            System.out.println("param: "+arg);
        }

        System.out.println("new Date: "+ new Date());
    }

}
