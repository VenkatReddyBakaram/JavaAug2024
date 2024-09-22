package com.vtech.coreApps.exceptions;

class SCEH{
    //overridden
    void f1() throws Exception {

    }

    void f2() throws Exception {

    }
}

class SubCEH extends SCEH
{
    //over riding
    void f1() throws NullPointerException {

    }

    void f3() throws Exception {
        f2();
    }
}

public class TestApp31 {

    public static void main(String[] args) {

    }
}
