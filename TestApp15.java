package com.vtech.coreApps;

abstract class A18{

    abstract void f1();

    void f2(){
        System.out.println("f2()-concrete method-A18");
    }

    void f5(){
        System.out.println("f5()-concrete method-A18");
    }
}

class A19 extends A18{

    void f1(){
        System.out.println("f1()-abstract method-A19");
    }

    void f3(){
        System.out.println("f3()-concrete method-A19");
    }

    void f2(){
        System.out.println("f2()-concrete method-A19");
    }
}


public class TestApp15 {

    public static void main(String[] args) {
        A18 ob = new A19();
        ob.f1();
        ob.f2();
        ob.f5();

        //ob.f3();

        A19 ob2 = new A19();
        ob2.f3();
    }
}
