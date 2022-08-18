package com.learncomparatorinterface;

import java.util.Comparator;

public class CustomComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return (o1>o2) ? -1 : (01<02) ? 1:0;
    }
}
