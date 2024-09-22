package com.vtech.coreApps;

class Singleton {
    private static Singleton singleton;

    private Singleton() {
        System.out.println("Singleton object is created only once");
    }

    public static Singleton getSingleton() {
        if (singleton == null)
            singleton = new Singleton();
        return singleton;
    }

}

public class TestApp21 {

    public static void main(String[] args) {

        Singleton ob1 = Singleton.getSingleton();
        Singleton ob2 = Singleton.getSingleton();
        Singleton.getSingleton();
        Singleton.getSingleton();
        Singleton.getSingleton();
        Singleton.getSingleton();
        Singleton.getSingleton();
        Singleton.getSingleton();
        Singleton.getSingleton();
        Singleton.getSingleton();
        Singleton.getSingleton();
        Singleton.getSingleton();
    }
}
