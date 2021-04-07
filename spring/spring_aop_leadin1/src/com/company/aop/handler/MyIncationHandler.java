package com.company.aop.handler;

import com.company.aop.util.ServiceTools;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyIncationHandler implements InvocationHandler {

    private Object target;

    public MyIncationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object res = null;

        ServiceTools.recordTime();

        res = method.invoke(target, args);

        ServiceTools.doLog();

        return null;
    }
}
