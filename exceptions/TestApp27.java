package com.vtech.coreApps.exceptions;

public class TestApp27 {

    public static void main(String[] args) {

        String colours[] = new String[]{"Red", "Blue", "Green", "Yellow", "Orange"};

        String name = null;

        try {
            for (int index = 0; index < colours.length; index++)
                System.out.println("Colour :" + colours[index]);

            System.out.println("Loop Terminated");
            System.out.println("Name is :" + name.toUpperCase());

        } catch (Exception exception) {
            System.err.println("Something went wrong. Please check your app once");
        }
        /* catch (ArrayIndexOutOfBoundsException exception){
            System.out.println(exception);
        }*/ //- error, because already ArrayIndexOutOfBoundsException is handled using Exception block.

        System.out.println("Regular code");


    }
}
