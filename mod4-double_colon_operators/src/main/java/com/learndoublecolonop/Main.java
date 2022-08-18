package com.learndoublecolonop;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {


        Calculate abc = (x,y) -> System.out.println(x+y);
        Calculate xyz = (x,y) -> Calculator.findSum(x,y);//if we have ready function
        Calculate jfk = Calculator::findSum;
        jfk.calculate(3,3);

        //Pure lambda way
        Calculate obj1 = (x,y) -> System.out.println(x*y);
        //Method references
        Calculator obj = new Calculator();
        Calculate omg = obj::findMultiply;
        //Method references V2
        Calculate omg1 = new Calculator()::findMultiply;

        //Pure lambda way
        BiFunction<String,Integer,String> func = (str,i) -> str.substring(i);
        System.out.println(func.apply("Joke",2));
        //Method reference way
        BiFunction<String,Integer,String> func1 = String::substring;//if substring is not static method why did we use String and not a string object this time
        //Explanation as to why we were able to directly using String class name instead of creating String object 1st?
        Function<Integer,Double> b = new MyClass()::method;
        //First arg in BiFunction Generics is type class that is why it knows what object you are referring to
        BiFunction<MyClass,Integer,Double> c = MyClass::method;

        Consumer<Integer> display = i -> System.out.println(i);
        Consumer<Integer> display2 = System.out::println;

    }
}
