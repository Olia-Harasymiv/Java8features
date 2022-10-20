package org.example;

@java.lang.FunctionalInterface
public interface FunctionalInterface {


    Integer method1(Integer i);

    default void defaultMethod1() {
        System.out.println("defaultMethod1");
    }

    default void defaultMethod2() {
        System.out.println("defaultMethod2");

    }

    static void staticMethod1() {
        System.out.println("staticMethod1");
    }

    static void staticMethod2() {
        System.out.println("staticMethod2");

    }
}
