package org.example.ba03;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.Date;

@Aspect
public class MyAspect {

    @AfterReturning(value = "execution(* *..SomeServiceImpl.doOther(..))" ,returning = "res")
    public void myAfterReturning(Object res) {
        System.out.println("returning: "+res);
    }
}
