package com.learnlambda.withoutlambdaexamples.BehaviorPrapamExample;

public class AppleHeavyPredicate implements ApplePredicate{
    @Override
    public boolean check(Apple apple) {
        return apple.getWeight() > 200;
    }
}
