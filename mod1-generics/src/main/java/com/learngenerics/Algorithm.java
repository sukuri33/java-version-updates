package com.learngenerics;

public final class Algorithm {

    public static void main(String[] args) {

        System.out.println(max( 1, 2));

    }

    public static <T> T max(T x, T y) {
        //return x>y ? x : y; compile error because greater or less than
        // operator can be applied to object type other than premitive
        return x.equals(y) ? x : y;
    }
}