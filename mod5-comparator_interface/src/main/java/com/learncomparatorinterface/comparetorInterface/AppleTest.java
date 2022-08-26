package com.learncomparatorinterface.comparetorInterface;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

import static java.util.Comparator.comparing;

public class AppleTest {

    public static void main(String[] args) {

        List<Apple> inventory = new ArrayList<Apple>();
        inventory.add(new Apple(300,Color.GREEN));
        inventory.add(new Apple(100,Color.RED));
        inventory.add(new Apple(200,Color.GREEN));
        inventory.add(new Apple(50,Color.RED));

        Apple singeApple = new Apple(100, Color.RED);

        Function<Apple,Integer> func = (Apple p) -> p.getWeight()+50;
        func.apply(singeApple);

//        Comparator<Apple> sortApples = Comparator.comparing(Apple::getWeight);
        Comparator<Apple> sortApples = comparing(apple -> apple.getWeight());
        inventory.sort(comparing(Apple::getWeight));
        System.out.println(inventory);

        //Reversed
        inventory.sort(comparing(Apple::getWeight).reversed());
        System.out.println(inventory);

        //Chaining
        inventory
                .sort(comparing(Apple::getWeight)
                        .reversed()
                        .thenComparing(Apple::getColor));
        System.out.println(inventory);
   }
}