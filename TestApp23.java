package com.vtech.coreApps;

class OuterC {

    private static final int outerField = 100;
    private final int instanceField = 200;

    private static void staticMethod() {
        System.out.println("Outer class's Static Method..!");
    }

    private void instanceMethod() {
        System.out.println("Outer class's Instance Method..!");
    }

    class InnerC {

        void innerInstanceMethod() {
            System.out.println("Outer class non-static/Instance Field ::" + instanceField);
            System.out.println("Outer class static Field ::" + outerField);
            staticMethod();
            instanceMethod();
        }
    }
}

public class TestApp23 {

    public static void main(String[] args) {

        OuterC outerC = new OuterC();
        OuterC.InnerC innerC = outerC.new InnerC();
        innerC.innerInstanceMethod();

    }
}
