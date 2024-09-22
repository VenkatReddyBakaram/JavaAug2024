package com.vtech.coreApps;

class Outer{

    static int outerField = 100;
    int instanceField = 200;

    static void staticMethod(){
        System.out.println("Outer class's Static Method..!");
    }

    static class StaticInner{

        static int innerField = 200;
        void innerClassMethod(){
            System.out.println("Inner class Field ::"+innerField);
            System.out.println("Outer class Field ::"+outerField);
            //System.out.println(instanceField); - error, because we cannot access outer class non-static member.
            staticMethod();
        }
    }
}

public class TestApp22 {

    public static void main(String[] args) {

        Outer.StaticInner ob = new Outer.StaticInner();
        ob.innerClassMethod();
    }
}
