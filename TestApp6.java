package com.vtech.coreApps;

class A8
{

    void f1(int a){
        System.out.println("f1(int)- method :"+a);
    }

   void f1(float a){
        System.out.println("f1(float)- method :"+a);
    }

    void f1(String a){
        System.out.println("f1(String)- method :"+a);
    }

  /* void f1(double a){
        System.out.println("f1(double)- method :"+a);
    }*/
}

public class TestApp6 {

    public static void main(String[] args) {
        A8 ob = new A8();
        ob.f1(200); //exact match to integer
        //ob.f1(100.50); //exact match to double
        //ob.f1((float)300.50); //downcasting
        //ob.f1(450.89); // exact match to double
        //ob.f1(456.67f); // lower to higher conversion - upcasting done by compiler
        ob.f1((float)450.50);
    }
}
