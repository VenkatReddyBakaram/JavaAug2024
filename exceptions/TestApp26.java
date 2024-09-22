package com.vtech.coreApps.exceptions;

public class TestApp26 {

    public static void main(String[] args) {

        String colours[] = new String[]{"Red", "Blue", "Green", "Yellow", "Orange"};

        String name = "Java";

        try {
            for (int index = 0; index < colours.length; index++)
                System.out.println("Colour :" + colours[index]);

            System.out.println("Loop Terminated");
            System.out.println("Name is :" + name.toUpperCase());
        } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            System.err.println("You are trying to access array element which is out of Bound. Please check once");
        } catch (NullPointerException nullPointerException) {
            System.err.println("You are trying to access null value. Please check once");
        }

        System.out.println("Regular code");


    }
}
