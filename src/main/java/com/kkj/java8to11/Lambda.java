package com.kkj.java8to11;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

public class Lambda {

    public static void main(String[] args) {
        Lambda lambda = new Lambda();
        lambda.run();
    }

    private void run() {
        
        // 람다에서 Local Variable을 참조
        // 이 변수가 사실상 final인 경우(final이라는 키워드는 없지만 이 변수를 더이상 어디서도 변경하지 않는 경우) 생략할 수 있다(Effective Final)
        final int baseNumber = 10;
        IntConsumer printInt = (i) -> {
            System.out.println(i + baseNumber);
        };

        printInt.accept(10);

        // 로컬 클래스
        class LocalClass {
            void printBaseNumber() {
                System.out.println(baseNumber);
            }
        }

        // 익명 클래스
        Consumer<Integer> integerConsumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(baseNumber);
            }
        };
    }
}
