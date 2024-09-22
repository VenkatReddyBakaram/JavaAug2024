package com.vtech.coreApps.exceptions;

public class TestApp25 {

    public static void main(String[] args) {

        int a,b,c;
        a=100;
        b=50;
        try {
            c = a / b;
            System.out.println("Result is :" + c);
        }
        catch(Exception e){
            System.out.println("Exception Handling code");
        }
        finally {
            System.out.println("mandatory code is executed...!");
        }
        System.out.println("Execute me..!");
    }
}
