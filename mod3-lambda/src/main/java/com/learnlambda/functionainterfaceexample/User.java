package com.learnlambda.functionainterfaceexample;

import com.learnlambda.lambdatasks.messagingapp.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class User {

    private Gender gender;
    private String name;
    private int age;



}
