package org.example.ba04;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.Date;

@Aspect
public class MyAspect {

    @Around(value = "execution(* *..SomeServiceImpl.doFirst(..))")
    public Object myAround(ProceedingJoinPoint pjp) throws Throwable {
        Object result = null;

        Object args[] = pjp.getArgs();
        String name = "";
        if(args != null && args.length > 0) {
             name = (String)args[0];
        }

        System.out.println("环绕通知 before"+ new Date());

        if ("Mars".equals(name)) {
            result = pjp.proceed();
        }

        System.out.println("环绕通知 after"+ new Date());
        return  result;
    }
}
