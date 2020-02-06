package currencies.types;

import currencies.Currency;
import currencies.util.CurrencyUtil;

/**
 * 
 */
public class Euro extends Currency {

    @Override
    public String toString() {
        String rv = new String();

        rv = String.format("€.2f", CurrencyUtil.round(getValue(), 2));

        return rv;
    }

    public Euro(double valueIn) {
        super(valueIn);
    }

    public Euro() {
        super();
    }
}