package com.streamintro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamOperations {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(0,1,2,3,4,5,6,4,7,8,9,10);
//        list.forEach(System.out::println);

//Intermediate operation
        System.out.println("***********Filter****************");
        list.stream()
                .filter(i -> i%2==0) //-> .filter() accepts Predicate func interface
                                    // boolean test(T t); one arg of any type and returns boolean
                .forEach(System.out::println);//This is a terminal operation.
                //this forEach belongs to Stream Interface and it is different from
                //List.forEach() method which belongs to Iterable Interface.

        System.out.println("****************Distinct*******************");
        Stream<Integer> newStream = list.stream()
                .filter(i -> i%2==0)
                .distinct();//Remove the duplication and returns a stream
        newStream.forEach(System.out::println);

        System.out.println("******************Limit*********************");
        list.stream()
                .filter(i -> i%2==0)
                .distinct()
                .limit(4)//Limit the side to given number; in this case to 1
                                //if this stream was holding 2 elements at line 32
                                //now only 1 element will be kept and truncate the remaining
                                //from the stream.
                .forEach(System.out::println);

        System.out.println("*******************Skip***********************");
        list.stream()
                .filter(i -> i%2==0)
                .distinct()
                .skip(4)//this is more like continue keyword in a loop
                            //What if the stream holds less elements that the given number?
                            //it will return empty stream in that case
                .forEach(System.out::println);

        System.out.println("*****************Map*********************");
        Stream<Integer> stream = Stream.of(1,4,7,9,11);
        stream.map(i -> i + 2)//map() accepts Function func interface
                              //R apply(T t);
                .filter(i -> i%3==0)
                .forEach(System.out::println);

        System.out.println("*****************Map with String*********************");
        Stream<String> listOfStr = Stream.of("JAVA","APPLE","HONDA","DEVELOPER");
//        listOfStr.filter(i->i.length() ==5)
                listOfStr.map(eachWord -> eachWord.length())
//                .filter(i -> i.endsWith("A"))
                 .forEach(i -> System.out.println(i));
    }
}
