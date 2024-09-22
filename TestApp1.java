package com.vtech.coreApps;

public class TestApp1 {

    public static void main(String[] args) {

        int a = 100;
        double b = a; //upcasting/implicit conversion int -> long -> float -> double

        System.out.println(a);
        System.out.println(b);

        double d = 500.39;
        int i = (int) d; //down casting/explicit conversion

        System.out.println(d);
        System.out.println(i);
    }
}
