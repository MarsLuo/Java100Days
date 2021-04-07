package com.company.aop;

import com.company.aop.handler.MyIncationHandler;
import com.company.aop.service.SomeService;
import com.company.aop.service.impl.SomeServiceImp;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        SomeServiceImp imp = new SomeServiceImp();
//
//        imp.doSome();
//        imp.doOther();

        SomeService target = new SomeServiceImp();

        InvocationHandler handler = new MyIncationHandler(target);

        SomeService proxy = (SomeService) Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                handler
        );

        proxy.doSome();
    }
}
