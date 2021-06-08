package org.example.ba04;

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

    @Override
    public String doFirst(String name, int age) {
        System.out.println("目标方法执行");
        return "doFirst";
    }
}
