package com.learnlambda.lambdatasks.prettyprintappletask;

public class LightOrHeavyApplePredicate implements ApplePredicateTask{
    @Override
    public String check(AppleTask a) {
        if (a.getWeight() < 155){
            return "A Light "+a.getColor().toString()+" apple";
        }else{
            return "A Heavy "+a.getColor().toString()+" apple";
        }
    }
}
