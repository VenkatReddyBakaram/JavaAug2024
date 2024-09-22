package com.vtech.coreApps;

interface I6{
    public abstract void f1();
}

class A23{
    public void f2(){
        System.out.println("f2()-method");
    }
}

//Multiple-Inheritance
class A24 extends A23 implements I6{

    public void f1() {
        System.out.println("f1()-method");
    }
}

public class TestApp19 {

    public static void main(String[] args) {
        A24 ob = new A24();
        ob.f1();
        ob.f2();

        I6 ob2 = new A24();
        ob2.f1();
        //ob2.f2();
    }
}
