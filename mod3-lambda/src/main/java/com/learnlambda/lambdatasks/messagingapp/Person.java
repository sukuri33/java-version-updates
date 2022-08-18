package com.learnlambda.lambdatasks.messagingapp;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Person {

    private Gender gender;
    private String name;
    private int age;

}
