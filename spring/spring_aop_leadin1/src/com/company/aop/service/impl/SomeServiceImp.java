package com.company.aop.service.impl;

import com.company.aop.service.SomeService;

public class SomeServiceImp implements SomeService {
    @Override
    public void doSome() {
        System.out.println("doSome");
    }

    @Override
    public void doOther() {
        System.out.println("doOther");
    }
}
