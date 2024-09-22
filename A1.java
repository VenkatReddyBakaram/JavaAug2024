package com.vtech.coreApps;

class I1 {

    void f1() {
        System.out.println("f1()-method responding from class I1");
    }
}

class I2 extends I1 {

    void f2() {
        f1();
        System.out.println("f2()-method responding from class I2");
    }
}

class I3 extends I2 {

    void f3() {
        f2();
        System.out.println("f3()-method responding from class I3");
    }
}

public class A1 {

    public static void main(String[] args) {
        I3 ob = new I3();
        ob.f3();
    }
}
