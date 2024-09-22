package com.vtech.coreApps.exceptions;

public class TestApp28 {

    public static void main(String[] args) {

        String colours[] = new String[]{"Red", "Blue", "Green", "Yellow", "Orange"};

        String name = "Java";

        try {
            for (int index = 0; index < colours.length; index++)
                System.out.println("Colour :" + colours[index]);

            System.out.println("Loop Terminated");
            System.out.println("Name is :" + name.toUpperCase());

        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("ArrayIndexOutOfBoundsException");
        } catch (NullPointerException exception) {
            System.out.println("NullPointerException");
        } catch (Exception exception) {
            System.err.println("Something went wrong. Please check your app once");
        }

        System.out.println("Regular code");
    }
}
