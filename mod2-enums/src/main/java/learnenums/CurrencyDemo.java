package learnenums;

public class CurrencyDemo {

    public static final CurrencyDemo PENNY = new CurrencyDemo(1);
    public static final CurrencyDemo NICKLE = new CurrencyDemo(5);
    public static final CurrencyDemo DIME = new CurrencyDemo(10);
    public static final CurrencyDemo QUARTER = new CurrencyDemo(25);

    private int value;

    public CurrencyDemo(int i) {
        this.value = i;
    }

    public int getValue() {
        return value;
    }

}
