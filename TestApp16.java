package com.vtech.coreApps;

//final class A20{
class A20{

    final void f1(){
        System.out.println("f1()-final method");
    }

    void f2(){
        System.out.println("f2()-method");
    }
}

class A21 extends A20{

    void f2(){
        System.out.println("f2()-method from A21");
    }

    /*void f1(){

    }*/
}


public class TestApp16 {

    public static void main(String[] args) {

        //final int a = 100;
        int a = 100;
        System.out.println(a);
        a=200;
        System.out.println(a);

        A21 ob = new A21();
        ob.f1();
        ob.f2();

    }
}
