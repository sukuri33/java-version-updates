package com.learnlambda.lambdatasks.prettyprintappletask;

import com.learnlambda.withoutlambdaexamples.BehaviorPrapamExample.Apple;
import com.learnlambda.withoutlambdaexamples.BehaviorPrapamExample.ApplePredicate;
import com.learnlambda.withoutlambdaexamples.BehaviorPrapamExample.Color;

import java.util.ArrayList;
import java.util.List;

public class TestApplePredicateTask {
    public static void main(String[] args) {
        List<AppleTask> appleInventory = new ArrayList<>();
        appleInventory.add(new AppleTask(80, ColorTask.GREEN));
        appleInventory.add(new AppleTask(155,ColorTask.RED));
        appleInventory.add(new AppleTask(120,ColorTask.GREEN));
        
        
//        prettyPrintApple(appleInventory,new LightOrHeavyApplePredicate());
//        prettyPrintApple(appleInventory,new WeightedApplePredicate());

        ApplePredicateTask abc1 = p -> {
          String ch = p.getWeight() < 150 ? "Heavy" : "Light";
            return "A"+ch+" "+p.getColor()+" apple";
        };

        ApplePredicateTask abc = p -> {
            if (p.getWeight()<150){
                return "A Light "+p.getColor().toString()+" apple";
            }else{
                return "A Heavy "+p.getColor().toString()+" apple";
            }
        };

        prettyPrintApple(appleInventory, abc);

        ApplePredicateTask xyz = p -> "An apple of "+ p.getWeight()+"g";

        prettyPrintApple(appleInventory, xyz);

    }

    private static void prettyPrintApple(List<AppleTask> appleInventory, ApplePredicateTask p) {

        for (AppleTask apple : appleInventory) {
            System.out.println(p.check(apple));
        }
    }
}
