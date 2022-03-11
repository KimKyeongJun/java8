package com.kkj.java8to11.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        name.add("keesun");
        name.add("whiteship");
        name.add("toby");
        name.add("foo");

        //parallelStream을 이용한 병렬처리
        // 병렬처리를 한다고 해서 반드시 속도가 빨라 지는 것은 아님
        // 데이터가 정말 방대하게 많은 경우에는 속도가 빨라질 수 있음
        // Stream과 parrelelStream을 사용해서 속도 비교 후 사용 하는 것이 더 좋을 수 있다.
        List<String> collect = name.parallelStream()
                .map(s -> {
                    System.out.println(s + " " + Thread.currentThread().getName());
                    return s.toUpperCase();
                })
                .collect(Collectors.toList());
        collect.forEach(System.out::println);

    }
}
