package com.vtech.coreApps;

class A6 {

    void f1() {
        System.out.println("f1()-method with no parmaters");
    }

    void f1(int a) {
        System.out.println("f1(int)-method with one int parmaters" + a);
    }

    void f1(int a, int b) {
        System.out.println("f1(int,int)-method with two int parmaters" + a + " " + b);
    }
}


public class TestApp4 {

    public static void main(String[] args) {
        A6 ob = new A6();
        ob.f1();
        ob.f1(100);
        ob.f1(100,200);
    }
}
