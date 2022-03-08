package com.kkj.java8to11.ingerfacestatic;

public class App {

    public static void main(String[] args) {
        Foo foo = new DefaultFoo("kyeongjun");

        foo.printName();
        foo.printNameUpperCase();
    }
}
