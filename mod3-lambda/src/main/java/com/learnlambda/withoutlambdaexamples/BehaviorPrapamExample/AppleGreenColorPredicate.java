package com.learnlambda.withoutlambdaexamples.BehaviorPrapamExample;

public class AppleGreenColorPredicate implements ApplePredicate{

    @Override
    public boolean check(Apple apple) {
         return apple.getColor().equals(Color.GREEN);
    }

}
