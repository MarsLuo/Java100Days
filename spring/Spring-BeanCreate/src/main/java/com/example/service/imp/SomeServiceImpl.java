package com.example.service.imp;

import com.example.service.SomeService;

public class SomeServiceImpl implements SomeService {

    public SomeServiceImpl() {
        System.out.println("无参构造");
    }

    @Override
    public void doSome() {
        System.out.println("doSome excused");
    }
}
