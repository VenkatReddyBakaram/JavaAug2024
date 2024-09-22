package com.vtech.coreApps;

class A11 {

    A11() {
        this(100);
        System.out.println("No-Parameterized - Constructor :");
    }

    A11(int a) {
        this(500.30f);
        System.out.println("Int - Constructor :" + a);
    }

    A11(float a) {
        this("Java");
        System.out.println("Float - Constructor :" + a);
    }

    A11(String str) {
        System.out.println("String - Constructor :" + str);
    }
}

public class TestApp9 {

    public static void main(String[] args) {
        new A11();
    }
}
