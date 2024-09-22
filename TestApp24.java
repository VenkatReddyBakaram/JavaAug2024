package com.vtech.coreApps;

class OuterClass{

    void outerMethod(){

        class LocalInnerClass{

            void innerMethod(){
                System.out.println("Local Inner Method");
            }
        }

        LocalInnerClass localInnerClass = new LocalInnerClass();
        localInnerClass.innerMethod();

    }
}

public class TestApp24 {

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        outerClass.outerMethod();
    }
}
