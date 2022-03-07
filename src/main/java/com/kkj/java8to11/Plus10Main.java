package com.kkj.java8to11;

import java.util.function.*;

public class Plus10Main {

    public static void main(String[] args) {
        Plus10 plus10 = new Plus10();
        System.out.println(plus10.apply(1));

        Function<Integer, Integer> p10 = (i) -> i + 10;
        System.out.println(p10.apply(1));

        Function<Integer, Integer> multiply2 = (i) -> 1*2;

        System.out.println(multiply2.apply(1));

        //입력 값을 가지고 먼저 뒤에 오는 함수를 적용
       Function<Integer, Integer> multiply2AndPlus10 = plus10.compose(multiply2);

        System.out.println(multiply2AndPlus10.apply(2));

        // 이어서 뒤에 오는 함수를 적용
        System.out.println(p10.andThen(multiply2).apply(2));

        Consumer<Integer> printT = i -> System.out.println(i);
        printT.accept(10);

        Supplier<Integer> get10 = () -> 10;
        System.out.println(get10.get());

        Predicate<String> startsWithKyeongjun = (s) -> s.startsWith("Kyeongjun");
        System.out.println(startsWithKyeongjun.test("Kyeongjun"));

        // function을 상속
        UnaryOperator<Integer> unaryPlus10 = (i) -> i+10;
        
        // BiFunction을 상속
    }
}
