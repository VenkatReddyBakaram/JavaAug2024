package com.vtech.coreApps.exceptions;

import java.io.IOException;
import java.io.InputStreamReader;

public class TestApp30 {

    public static void main(String[] args) throws ClassNotFoundException{
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(System.in);
            inputStreamReader.read();
            Class.forName("com.vtech.SampleClass");
        } catch (IOException ioException) {
        } /*catch (ClassNotFoundException classNotFoundException) {
        }*/
    }
}
