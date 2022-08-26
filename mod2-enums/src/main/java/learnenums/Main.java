package learnenums;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        //How to access a constant?
        CurrencyDemo penny = CurrencyDemo.PENNY;
        System.out.println(CurrencyDemo.DIME.getValue());
        System.out.println(CurrencyEnum.PENNY);
        //Returns the position declared in the class
        // other words, Index number of that object in that class
        System.out.println(CurrencyEnum.QUARTER.ordinal());

        //How to get all the constants?
        CurrencyEnum[] currencies = CurrencyEnum.values();
        for (CurrencyEnum currency : currencies) {
            System.out.println(currency);
        }
    
        //How to use switch-case with enums?
        switch (CurrencyEnum.DIME){
            case PENNY:
                System.out.println("1 Cent");
                break;
            case NICKLE:
                System.out.println("5 Cents");
                break;
            case DIME:
                System.out.println("10 Cents");
                break;
            default:
                System.out.println("25 Cents");

        }

        //Create enum for Math operations
        //Create a method called 'calculateTwoNum' which accepts 3 params and prints the result
        //based on the selected operator in a switch case declared inside the method
        calculatedTwoNum(MathOpEnums.MINUS,4,2);

    }

    private static void calculatedTwoNum(MathOpEnums OP, int i, int j) {

        switch (OP){
            case PLUS:
                System.out.println(i+j);
                break;
            case MINUS:
                System.out.println(i-j);
                break;
            case DIVISION:
                System.out.println(i/j);
                break;
            case MULTIPLICATION:
                System.out.println(i*j);
        }

    }


}
