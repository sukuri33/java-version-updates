package com.learnlambda.lambdatasks.messagingapp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestMessagingApp {
    public static void main(String[] args) {

        Person p1 = new Person(Gender.FEMALE, "Jacky", 31);
        Person p2 = new Person(Gender.MALE, "Harry", 25);
        Person p3 = new Person(Gender.MALE, "Wack", 19);
        Person p4 = new Person(Gender.FEMALE, "Marry", 24);

//        List<Person> memberList = new ArrayList<>(Arrays.asList(p1,p2,p3,p4));
        List<Person> memberList = Arrays.asList(p1,p2,p3,p4);

        CheckMember chk = person -> {
            if (person.getAge() >= 18 && person.getAge() <= 25 && person.getGender().equals(Gender.MALE)) {
                return true;
            }
            return false;
        };

        CheckMember chk1 = person -> person.getAge() >= 18 && person.getAge() <= 25 && person.getGender()==Gender.MALE;

        sendMsgToMaleMembers(memberList,chk1);
    }

    private static void sendMsgToMaleMembers(List<Person> memberList, CheckMember chk1) {
        for (Person person : memberList) {
            if (chk1.checkMember(person)) {
                System.out.println("Admin is sending message to member: " + person.getName());
            } else {
                System.out.println("Hi "+person.getName()+" you must be a male and age between 18 to 25 to receive a message from Admin" +
                        "\nBut your gender is: " + person.getGender()
                        + "\nBut your age is: " + person.getAge());
            }
        }
    }
}
