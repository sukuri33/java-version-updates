package com.optionalandbigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo {
    public static void main(String[] args) {

        double amount1 = 374.56;
        double amount2 = 374.26;
        System.out.println(amount1 - amount2);//output: 0.30000000000001137
        //double precision is problematic
        //hence the BigDecimal
        BigDecimal b1 = new BigDecimal("374.56");
        BigDecimal b2 = new BigDecimal("374.26");
        BigDecimal b3 = BigDecimal.valueOf(374.56);//Internally the method will toString the double value and return String
        System.out.println(b1.subtract(b2));
        BigDecimal readyCommonDecimalVal = BigDecimal.ONE;
        System.out.println(b3.add(readyCommonDecimalVal));

        //Scaling
        BigDecimal number1 = new BigDecimal("2.45123");
        System.out.println(number1.setScale(2, RoundingMode.CEILING));

        //Do not use equals() method anymore, instead use compareTo() as BigDecimal implements Comparable<> interface
        // and in BigDecimal class compareTo() method has been overridden
        System.out.println(new BigDecimal("2").compareTo(new BigDecimal("2")));
        System.out.println(new BigDecimal("2").compareTo(new BigDecimal("3")));
        System.out.println(new BigDecimal("2").compareTo(new BigDecimal("1")));
    }
}
