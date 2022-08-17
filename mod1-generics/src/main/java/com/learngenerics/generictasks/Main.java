package com.learngenerics.generictasks;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> listOfNumbers = Arrays.asList(1,2,3,4,5,6,7);

//        OddPredicate oP = new OddPredicate();
//        for (Integer each : listOfNumbers
//             ) {
//            System.out.println(oP.test(each));
//        }
        System.out.println("****Printing odd numbers count********");
        int countOfOddNum = countIf(listOfNumbers, new OddPredicate());
        System.out.println(countOfOddNum);
        System.out.println("****Printing even numbers count********");
        int countOfEvenNum = countIf(listOfNumbers, new EvenPredicate());
        System.out.println(countOfEvenNum);

    }

    private static<T> int countIf(List<T> listOfItems, UnaryPredicate<T> p) {
        int count = 0;
        for (T eachItem : listOfItems) {
            if (p.test(eachItem)){
                count++;
            }
        }

        return count;
    }
}
