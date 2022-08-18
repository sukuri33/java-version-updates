package com.learndoublecolonop;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class CarTest {
    public static void main(String[] args) {

        //0 Arg constructor
        Supplier<Car> a = () -> new Car();
        Supplier<Car> a1 = Car::new;
        //Single Arg constructor
        Function<Integer,Car> b = model -> new Car(model);
        Function<Integer,Car> b1 =Car::new;
        //Two arg constructor
        BiFunction<String,Integer,Car> c = (make,model) -> new Car(make,model);
        BiFunction<String,Integer,Car> c1 = Car::new;
        //return type is Car object
        Car honda = c1.apply("Honda",2019);
        System.out.println(honda.getMake());

    }
}
