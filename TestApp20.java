package com.vtech.coreApps;

interface I7{

    void f1();
    void f2();
    void f3();
    void f4();
    void f5();
}

class AdapterI7 implements I7{

    public void f1() {
    }

    public void f2() {
    }

    public void f3() {
    }

    public void f4() {
    }

    public void f5() {
    }
}

class A25 extends AdapterI7{

    public void f5() {
        System.out.println("f5()-method");
    }
}


public class TestApp20 {

    public static void main(String[] args) {
        I7 ob = new A25();
        ob.f5();
    }
}
