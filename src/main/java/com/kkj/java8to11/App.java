package com.kkj.java8to11;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class App {

    public static void main(String[] args) {

        // 스태틱 메소드 참조
        UnaryOperator<String> hi = Greeting::hi;

        // 특정 객체의 인스턴스 메소드 참조
        Greeting greeting = new Greeting();
        UnaryOperator<String> hello = greeting::hello;

        // 생성자 참조
        Supplier<Greeting> newGreeting = Greeting::new;
        Greeting greeting1 = newGreeting.get();

        //입력값을 받는 생성자
        Function<String, Greeting> greetingFunction = Greeting::new;
        greetingFunction.apply("Kyeongjun");

        // 임의 객체의 인스턴스 메소드 참조
        String[] names = { "Kyeongjun", "keesun"};
        Arrays.sort(names, String::compareToIgnoreCase);
    }
}
