package com.syntax.class15;

public class VariablesDemo2 {
    int num=10;
    void method(){
        System.out.println(num);
    }
    void method2(){
        System.out.println(num);
    }

    public static void main(String[] args) {
        VariablesDemo2 v2=new VariablesDemo2();
        System.out.println(v2.num);
        v2.method();
    }
}
