package com.learnlambda.lambdatasks.prettyprintappletask;

public class WeightedApplePredicate implements ApplePredicateTask{
    @Override
    public String check(AppleTask a) {
        return "An apple of "+ a.getWeight()+"g";
    }
}
