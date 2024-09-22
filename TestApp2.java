package com.vtech.coreApps;

class A2 {

    void f1() {
        System.out.println("f1()-method from class A2");
    }
}

class A3 extends A2 {

}


public class TestApp2 {

    public static void main(String[] args) {
        A3 ob = new A3();
        ob.f1();
    }
}
