package com.vtech.coreApps;

interface I4 {
    int A = 100;
    public static final String NAME = "Interface I4";

    void f1();
    public abstract void f3();
}

interface I5 extends I4 {
    int B = 200;

    void f2();
}

class A22 implements I5 {

    public void f2() {
        System.out.println(B);
    }

    public void f1() {
        System.out.println(A);
    }

    public void f3() {
        System.out.println("f3() method");
    }
}

public class TestApp18 {

    public static void main(String[] args) {
        A22 ob = new A22();
        ob.f1();
        ob.f2();
        ob.f3();
        System.out.println(I4.NAME);
    }
}
