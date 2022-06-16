package com.syntax.class16;

public class InstanceDemo {
    String str="instance";

    void method1(){
        str="method1";
    }
    void method(){
        System.out.println(str);
    }

    public static void main(String[] args) {
        InstanceDemo id=new InstanceDemo();
        System.out.println(id.str);
        id.method();
        id.method1();
        id.method();
    }
}
