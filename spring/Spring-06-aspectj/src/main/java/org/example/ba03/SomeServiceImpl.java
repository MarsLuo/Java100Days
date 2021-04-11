package org.example.ba03;

public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome(String name, Integer age) {
        System.out.println("SomeServiceImpl doSome");
    }

    @Override
    public String doOther() {
        System.out.println("do Other 执行");
        return "Mars";
    }
}
