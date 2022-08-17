package com.learngenerics;

import java.util.ArrayList;

/**
 * This Class will attempt to demonstrate "why generics was introduced?"
 * Hence, intentionally the ArrayList class was used without Generic part
 * so that reader may appreciate the importance of the Generics in JAVA 5
 *
 * With the help of Generics, you tell the compiler what types of objects are permitted in
 * each collection.
 * The compiler inserts casts for you automatically behind scene and also gives you warning
 * at compile time if you try to insert an object of wrong type - Please look at below example
 */
public class WithGenerics {

    public static void main(String[] args) {
        //Type protection by introducing diamond op <ObjectType> right after ClassName
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
//        arrayList.add("Orange");
/**     As soon as you try to add an object type other than Integer
 *      you will face compile error - to see it please uncomment line 24
 *      Because we applied Generics <Integer> after class name*/

        printDoubledWithGenerics(arrayList);

    }

    private static void printDoubledWithGenerics(ArrayList<Integer> arrayList) {

        for (Object each : arrayList) {
            System.out.println((Integer)each * 2);
        }
    }

}
