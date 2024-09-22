package com.vtech.coreApps;

class A9{

    A9(int a){
        System.out.println("Int - Constructor :"+a);
    }

    A9(float a){
        System.out.println("Float - Constructor :"+a);
    }

   /* A9(double a){
        System.out.println("Double - Constructor :"+a);
    }*/

}


public class TestApp7 {

    public static void main(String[] args) {

        new A9(100);
        //new A9(100.50f); // compiler will convert from lower float to double higher automatically. upcasting
        new A9((float)500.50);
    }
}
