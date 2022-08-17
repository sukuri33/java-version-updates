package com.learngenerics.generictasks;

import java.util.Arrays;

public class GenerticSwapTwoElmMethod {


    public static void main(String[] args) {


        Integer[] a = {1,2,3,4};
        String[] b = {"A","2","3","4"};
        System.out.println("***********Method without Generics************");
        swapWithoutGeneric(a,0,2);
        System.out.println(Arrays.toString(a)); //[3,2,1,4]
        System.out.println("***********Method with Generics handling Integer************");
        swapWithGeneric(a,2,3); //[1, 2, 3, 4]
        System.out.println(Arrays.toString(a));
        System.out.println("***********Method with Generics handling String************");
        swapWithGeneric(b,0,2);
        System.out.println(Arrays.toString(b));//[3, 2, A, 4]

    }

    private static void swapWithoutGeneric(Integer[] a, int i, int j) {

//        a[i] = a[i] + a[j];
//        a[j] = a[i] - a[j];
//        a[i] = a[i] - a[j];

            int temp = a[i];
            a[i] = a[j];
            a[j] = temp; //Autoboxing

    }

    private static<T> void swapWithGeneric(T[] a, int i, int j) {

//        a[i] = a[i] + a[j];
//        a[j] = a[i] - a[j];
//        a[i] = a[i] - a[j];

        T temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

}
