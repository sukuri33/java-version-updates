package com.learnlambda.withoutlambdaexamples.sorting;

public class TestSorting {


    public static void main(String[] args) {


        TestSorting as = new TestSorting();

        QuickSorting qs = new QuickSorting();
        BubbleSorting bs = new BubbleSorting();

        as.sort(qs);
        as.sort(bs);


    }

    private void sort(Sorting sorting) {

        sorting.sort();

    }

}
