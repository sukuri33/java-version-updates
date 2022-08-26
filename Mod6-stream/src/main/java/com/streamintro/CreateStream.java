package com.streamintro;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreateStream {
    public static void main(String[] args) {

        //Creating Stream from an Array
        String[] coursesArray = {"Java","Spring","Agile"};
        Stream<String> courseStream = Arrays.stream(coursesArray);

        //Creating Stream from a Collection
//        List<String> courseList = Arrays.asList("Java","Spring","Agile");
        Stream<String> courseStream2 = Arrays.asList("Java","Spring","Agile").stream();

        //Creating Stream from a list of objects from an customer class
        List<Course> myCourses = Arrays.asList(
                new Course("Java", 100),
                new Course("SDET", 101),
                new Course("TEST", 102)
        );
        Stream<Course> myCourseStream = myCourses.stream();

        //creating stream with .of() method in Stream interface
        Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9,0);


    }
}
