package com.kkj.java8to11.ingerfacestatic;

public interface Foo {

    void printName();

    /**
    * @implSpec
    * 이 구현체는  getName()으로 가져온 문자를 대문자로 바꿔서 출력한다.
    */
    default void printNameUpperCase() {
        System.out.println(getName().toUpperCase());
    }

    static void pintAnything() {
        System.out.println("Foo");
    }


    String getName();

}
