package com.learncomparatorinterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10,9,11,89,44);
        Collections.sort(list);
//        Collections.reverse(list);
//        System.out.println(list);

        Collections.sort(list,new CustomComparator());
        System.out.println(list);

        Collections.sort(list,((o1,o2) -> (o1>o2) ? -1 : (01<02) ? 1:0));


    }
}
