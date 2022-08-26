package com.learnlambda.functionainterfaceexample;

import com.learnlambda.lambdatasks.messagingapp.Gender;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class TestUser {
    public static void main(String[] args) {
       List<User> userList = Arrays.asList(
               new User(Gender.FEMALE, "Jacky", 31),
               new User(Gender.MALE, "Harry", 25),
               new User(Gender.MALE, "Wack", 19),
               new User(Gender.FEMALE, "Eleen", 24)
       );

        System.out.println("Print all the elements in the list");
        /*printUser(userList,i -> i.equals(i));
        printUser(userList,i -> i.canEqual(i));
        printUser(userList,i -> i.getClass().getSimpleName().equals("User"));*/
        printUser(userList,i -> true);

        System.out.println();

        System.out.println("Print all people whose first name starts with E");
        printUser(userList,i -> i.getName().startsWith("E"));

        Laptop hpLaptop = build(()->{
            Laptop laptop = new Laptop();
            laptop.setCPU("I9");
            laptop.setScreenSize("17");
            laptop.setOS("Windows 11");

            return laptop;
        });

        System.out.println(hpLaptop);

    }

    private static Laptop build(LaptopBuilder p) {
        return p.build();
    }

    private static void printUser(List<User> userList, Predicate<User> p) {
        for (User user : userList) {
            if (p.test(user))
                System.out.println(user);
        }
    }
}
