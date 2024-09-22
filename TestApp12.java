package com.vtech.coreApps;

class A14 {

    int a = 100;

    void im() {
        System.out.println("instance method from super class A14");
    }

    static void sm() {
        System.out.println("static method");
    }
}

class A15 extends A14 {

    int a = 200;

    void im() {
        System.out.println(a);
        System.out.println(super.a);
        super.im();
        super.sm();
    }

}

public class TestApp12 {

    public static void main(String[] args) {
        A15 ob = new A15();
        ob.im();
    }
}
