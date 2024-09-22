package com.vtech.coreApps;

class A7 {

    void f1(int a) {
        System.out.println("f1(int)-method with one int parameter :" + a);
    }

    void f1(float a) {
        System.out.println("f1(float)-method with one float parameter :" + a);
    }

    void f1(String a) {
        System.out.println("f1(String)-method with one String parameter :" + a);
    }
}

public class TestApp5 {

    public static void main(String[] args) {
        A7 ob = new A7();
        ob.f1(100);
        ob.f1(100.50f);
        ob.f1("Java Language");
    }
}
