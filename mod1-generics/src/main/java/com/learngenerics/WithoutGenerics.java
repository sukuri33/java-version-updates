package com.learngenerics;

import java.util.ArrayList;

/**
 * This Class will attempt to demonstrate "why generics was introduced?"
 * Hence, intentionally the ArrayList class was used without Generic part
 * so that reader may appreciate the importance of the Generics in JAVA 5
 *
 * Before Generics, you had to cast every object you read from a collection.
 * If someone accidentally inserted/added an object of the wrong type, cast could
 * fail at runtime - Please refer to WithGenerics class for 2nd part of this comment
 */
public class WithoutGenerics {

    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add("Orange");
/**     Adding a String value to the ArrayList,
        although we won't get any compile error now. However, as soon as we execute this code
        we will get ClassCastException because in the printDoubledWithoutGenerics() method
        math operation will try to multiple "Orange" String object by two
        Please refer comments in the method body for solutions*/

        printDoubledWithoutGenerics(arrayList);

    }

    private static void printDoubledWithoutGenerics(ArrayList arrayList) {

        for (Object each : arrayList) {
            System.out.println((Integer)each * 2);//WARNING: This line will throw an exception
                                                // If someone adds a type other than Integer!
        }
/** Below is how we might be able to handle the exception if an undesired Object is added to our arrayList
 But imagine, if someone else adds any other object type other than an Integer object?
 Then we must handle that by adding more if statements like we did for String object in the below example
 Which would create boilerplate code at the end
 Therefor, let's identify the MAIN problem causing this issue in the 1st place?
 The real issue here is that arrayList accepts any type of object
 And we need to somehow prevent that to happen by putting a strict rule for what object type can be added to the arrayList object
 The answer is by applying Generics and please refer to WithGenerics class under the same folder for compression*/

/*        for (Object each : arrayList) {
            if (each instanceof Integer){
                System.out.println((Integer)each * 2);
            }else{
                System.out.println(each+" is a not type of Integer");
            }

        }*/

    }

}
