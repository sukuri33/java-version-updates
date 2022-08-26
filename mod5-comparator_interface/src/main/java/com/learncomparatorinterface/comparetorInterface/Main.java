package com.learncomparatorinterface.comparetorInterface;

import com.learncomparatorinterface.comparetorInterface.CustomComparator;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10,9,11,89,44);
        System.out.println("Ascending order sort");
        Collections.sort(list);
        System.out.println(list);

        System.out.println("Descending order sort with built-in method reverse() in Collections interface");
        Collections.reverse(list);
        System.out.println(list);

        System.out.println("Descending order sort with custom Comparator class by implementing Comparator functional Interface ");
        list.sort(new CustomComparator());
        System.out.println(list);

        System.out.println("Lambda without a custom comparator class like above - passing the functional implementation directly to the sort method");
//        list.sort((o1,o2) -> (o1>o2) ? -1 : (o1<o2) ? 1:0);
        list.sort((o1,o2) -> o2.compareTo(o1));
//        list.sort(Comparator.reverseOrder());
        System.out.println(list);
    }
}
