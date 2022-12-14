package com.learnlambda.withoutlambdaexamples.BehaviorPrapamExample;

import java.util.ArrayList;
import java.util.List;

public class TestApple {

    public static void main(String[] args) {


        List<Apple> appleInventory = new ArrayList<>();
        appleInventory.add(new Apple(300,Color.GREEN));
        appleInventory.add(new Apple(100,Color.RED));
        appleInventory.add(new Apple(200,Color.GREEN));
        appleInventory.add(new Apple(50,Color.RED));

        System.out.println(filterApples(appleInventory,new AppleGreenColorPredicate()));
        System.out.println(filterApples(appleInventory,new AppleHeavyPredicate()));


    }

    private static<T> List<Apple> filterApples(List<Apple> inventory, ApplePredicate applePredicate){

        List<Apple> result = new ArrayList<>();

        for (Apple apple: inventory) {
            if (applePredicate.check(apple)){
                result.add(apple);
            }
        }
        return result;
    }


}


/**
 *
 * Passing Code with Behavior Parameterization
 *
 * In software engineering, user requirements will change.
 *
 * Example: Imagine an application to help a farmer understand his inventory.
 *  - Find all green apples in the inventory
 *  - Find all apples heavier than 200g
 *
 *  As a developer, we have to minimize our engineering effort.
 *
 *
 */