package com.learngenerics.generictasks;

public class EvenPredicate implements UnaryPredicate<Integer>{
    @Override
    public boolean test(Integer obj) {
        return obj %2 == 0;
    }
}
