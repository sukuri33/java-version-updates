package com.learnlambda.functionainterfaceexample;

import com.learnlambda.withoutlambdaexamples.BehaviorPrapamExample.Apple;
import com.learnlambda.withoutlambdaexamples.BehaviorPrapamExample.ApplePredicate;

import java.util.function.Predicate;

public class FunctionalInterfecesTest {
    //anonymous class
    ApplePredicate ap = new ApplePredicate() {
        @Override
        public boolean check(Apple apple) {
            return false;
        }
    };

    public static void main(String[] args) {


        System.out.println("******************Predicate****************");
        Predicate<Integer> lessThan = i -> i < 10;
        System.out.println(lessThan.test(5));




    }


}
