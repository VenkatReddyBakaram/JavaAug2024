package com.vtech.coreApps;

class A13 {

    static int a = 100;
    int b = 200;

    static void sm() {
        System.out.println("static method");
    }

    void im() {
        System.out.println("instance method");
    }

    static {
        System.out.println("Static block is executed..!");
        System.out.println("Static Variable A :" + a);
        sm();
        //im(); - error
        //System.out.println("Instance Variable B :"+b); - error
    }

    {
        System.out.println("Common Logic is Executed before invoking the constructor");
        System.out.println("Common Logic-2 is Executed before invoking the constructor");

        System.out.println("Static Variable A :" + a);
        System.out.println("Instance Variable B :" + b);

        sm();
        im();
    }

    A13() {
        System.out.println("No-Parameterized - Constructor :");
    }

    A13(int a) {
        System.out.println("Int - Constructor :" + a);
    }

    A13(float a) {
        System.out.println("Float - Constructor :" + a);
    }

    A13(String str) {
        System.out.println("String - Constructor :" + str);
    }
}

public class TestApp11 {

    public static void main(String[] args) {
        new A13();
        new A13(100);
        new A13(56.50f);
        new A13("Java");
    }
}
