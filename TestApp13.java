package com.vtech.coreApps;

class A16 {

    A16(){
        System.out.println("super class constructor - A16");
    }
}

class A17 extends A16{

    A17(){
        super();
        System.out.println("sub class constructor - A17");
    }

    A17(int a){
        this();
        System.out.println("Parameterized Constructor :"+a);
    }
}

public class TestApp13 {

    public static void main(String[] args) {

        new A17();
        new A17(200);
    }
}
