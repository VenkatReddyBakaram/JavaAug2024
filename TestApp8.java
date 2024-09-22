package com.vtech.coreApps;

class A10 {

    A10() {
        new A10(100);
        System.out.println("No-Parameterized - Constructor :");
    }

    A10(int a) {
        new A10(500.30f);
        System.out.println("Int - Constructor :" + a);
    }

    A10(float a) {
        new A10("Java");
        System.out.println("Float - Constructor :" + a);
    }

    A10(String str) {
        System.out.println("String - Constructor :" + str);
    }
}

public class TestApp8 {

    public static void main(String[] args) {
        new A10();
    }
}
