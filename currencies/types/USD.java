package currencies.types;

import currencies.Currency;
import currencies.util.CurrencyUtil;

/**
 * @author Kyle Bye
 * @version 1.0
 */
public class USD extends Currency {

    public String toString() {
        String rv = new String();

        rv = String.format("$%.2f", CurrencyUtil.round(getValue(), 2));

        return rv;
    }

    public USD(double valueIn) {
        super(valueIn);
    }

    public USD() {
        super();
    }
}