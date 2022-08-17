package com.learngenerics.generictasks;

public class OddPredicate implements UnaryPredicate<Integer>{

    public static void main(String[] args) {

        int[] a = {1,2,3,4,5,6,7,8,9,10};
        countOddIntegers(a);

    }

    private static void countOddIntegers(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0){
                count++;
            }
        }
        System.out.println("Number of odd integers :"+count);
    }


    @Override
    public boolean test(Integer obj) {
        return obj %2 != 0;
    }
}
