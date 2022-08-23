package com.learnlambda.functionainterfaceexample;

import com.learnlambda.withoutlambdaexamples.BehaviorPrapamExample.Apple;
import com.learnlambda.withoutlambdaexamples.BehaviorPrapamExample.ApplePredicate;

import java.util.Objects;
import java.util.function.*;

/**
 * From a technical perspective all a lambda is a shortcut to defining an implementation
 * of a functional interface
 */
public class FunctionalInterfacesTest {
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

        System.out.println("******************Consumer****************");
        Consumer<Integer> printInt = i -> System.out.println(i);
        printInt.accept(11);
        Consumer<String> printStr = System.out::println;
        printStr.accept("Hello");

        System.out.println("******************Bi-Consumer****************");
        BiConsumer<Integer,Integer> sumTwoNum = (x,y) -> System.out.println(x+y);
        sumTwoNum.accept(10,10);
        BiConsumer<String,String> contactTwoStr = (x,y) -> System.out.println(x+y);
        contactTwoStr.accept("Hello"," World");

        System.out.println("******************Function****************");
        Function<String,Integer> convertStrToInt = Integer::valueOf;
        System.out.println(convertStrToInt.apply("10"));

        System.out.println("******************Bi-Function****************");
        BiFunction<Integer,Integer,Boolean> isEqual = Objects::equals;
        System.out.println(isEqual.apply(10,10));

        System.out.println("******************Supplier****************");
//        Supplier<Double> randomVal = () -> Math.random();
        Supplier<Double> randomVal = Math::random;
        System.out.println(randomVal.get().toString());
        Supplier<String> echo = () -> "Hello";
        System.out.println(echo.get());
    }


}
