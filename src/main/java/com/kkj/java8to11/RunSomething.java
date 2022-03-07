package com.kkj.java8to11;


@FunctionalInterface
public interface RunSomething {

    // 추상 메서드가 하나만 있으면 함수형 인터페이스이다!
    void doIt();

//    static void printName() {
//        System.out.println("KyeongJun");
//    }
//
//    default void printAge(){
//        System.out.println("30");
//    }
}
