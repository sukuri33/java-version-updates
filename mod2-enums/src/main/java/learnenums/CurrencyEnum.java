package learnenums;

import java.lang.Enum;

/**
 * Since enum class already extended Enum abstract class
 * that is why toString(); and values(); are already inherited from parent class
 * You can declare your Enum in lower case, but you shouldn't
 */
public enum CurrencyEnum {
    PENNY(1),NICKLE(5),DIME(10),QUARTER(25);

    private int value;

    CurrencyEnum(int i) {
        this.value = i;
    }

    public int getValue() {
        return value;
    }

}
