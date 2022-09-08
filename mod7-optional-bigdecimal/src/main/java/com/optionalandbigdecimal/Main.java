package com.optionalandbigdecimal;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {


        List<Integer> number = Arrays.asList(2,4,2,10,23);
        List<String>  names = Arrays.asList("Java","JavaScript","Go","PHP");

        Optional<String> empty = Optional.empty();
//        System.out.println(empty);
//        System.out.println(empty.isPresent());
//        System.out.println(Optional.of(number).isPresent());
//        System.out.println(empty.get());

        //ifPresent
        Optional<Integer> bigNumber =
                number.stream().filter(integer -> integer > 100).findAny();
        bigNumber.ifPresent(System.out::println);
//        System.out.println(bigNumber);
        Optional<String> nonJ = names.stream().filter(s -> s.startsWith("Q")).findAny();

        //get()
//        System.out.println(bigNumber.get());

        //orElse
        System.out.println(bigNumber.orElse(5));
        System.out.println(nonJ.orElse("Non"));

    }
}
