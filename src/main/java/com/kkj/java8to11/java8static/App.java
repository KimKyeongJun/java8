package com.kkj.java8to11.java8static;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class App {

    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        name.add("keesun");
        name.add("whiteship");
        name.add("toby");
        name.add("foo");

        // forEach
        name.forEach(System.out::println);


        //spliterator
        Spliterator<String> spliterator = name.spliterator();
        Spliterator<String> spliterator1 = spliterator.trySplit();
        while(spliterator.tryAdvance(System.out::println));
        System.out.println("=====================");
        while(spliterator1.tryAdvance(System.out::println));

        //stream
        long k = name.stream().map(String::toUpperCase)
                .filter(s -> s.startsWith("K"))
                .count();
        System.out.println(k);

        //removeIf
        name.removeIf(s -> s.startsWith("k"));

        //comparator
        name.sort(String::compareToIgnoreCase);



    }
}
