package com.learndoublecolonop;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
                                         //|below highlight portion is known as
                                         //|implementation of the abstract method of the functional Interface
        Predicate<Integer> predicate = p -> p%2 == 0 ? true:false;//(Simplified: p%2 == 0 )
        System.out.println(predicate.test(0));

        Calculate abc = (x,y) -> System.out.println(x+y);//Without a ready method which handles addition op between two integers
        Calculate xyz = (x,y) -> Calculator.findSum(x,y);//if we have ready method already
        //for Static method
        Calculate jfk = Calculator::findSum;//Method reference/Double Colon op can be used when we have ready method
        jfk.calculate(3,3);

        //Pure lambda way
        Calculate obj1 = (x,y) -> System.out.println(x*y);
        obj1.calculate(10,2);
        //Method references
        //for instance method
        Calculator obj = new Calculator();
        Calculate omg = obj::findMultiply;
        //Method references V2
        Calculate omg1 = new Calculator()::findMultiply;
        omg1.calculate(3,3);

        //Pure lambda way
        BiFunction<String,Integer,String> func = (str,i) -> str.substring(i);
        System.out.println(func.apply("Joke",2));
        //Method reference way
        BiFunction<String,Integer,String> func1 = String::substring;//if substring is not static method why did we use String and not a string object this time
        //Explanation as to why we were able to directly using String class name instead of creating String object 1st?
        Function<Integer,Double> b = new MyClass()::method;
        //First arg in BiFunction Generics is the type[MyClass] so when the return type is known you don't need to use [new] key word
        //to create an obj to access ot its method because java compiler knows based on that return type
        //example below:

        BiFunction<MyClass,Integer,Double> c = MyClass::method;
        BiFunction<MyClass,Integer,Double> c1 = (p,t) -> new MyClass().method(t);
        System.out.println(c1.apply(new MyClass(), 5));

        Consumer<Integer> display = i -> System.out.println(i);
        Consumer<Integer> display2 = System.out::println;

    }
}
