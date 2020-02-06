package currencies;

import currencies.types.*;

/**
 * @author Kyle Bye
 * @version 1.0
 */
public abstract class Currency implements Valueable {

    private double value;

    public final int USD_TYPE = 1;
    public final int EURO_TYPE = 2;

    private final double USD_VALUE = 1.0;
    private final double EURO_VALUE = 0.91;

    public double getValue(){
        return value;
    }
    private void setValue(double valueIn) {
        value = valueIn;
    }

    public Currency add(Currency other) {
        Currency rv = null;
        int returnCurrencyType = this.typeOfCurrency();
        double result = 0.0;

        // Converted both 'this' and 'other' instance
        // to USD type currencies to simplify addition.
        result = this.convertTo(USD_TYPE).getValue() + other.convertTo(USD_TYPE).getValue();
        
        // Convert to 'this' currency type.
        rv = (new USD(result)).convertTo(returnCurrencyType);

        return rv;
    }
    public Currency subtract(Currency other) {

        // Return the addition if 'this' value plus the negation
        // of the 'other' value.
        return this.add(new USD(other.convertTo(USD_TYPE).getValue() * -1));
    }

    public Currency convertTo(int currencyType) {

        Currency rv = null;
        double value = getValue();
        int thisCurrencyType = typeOfCurrency(); 

        // Convert 'this' value instance of Currency to a
        // USD value in order to keep the conversion simple.
        if (thisCurrencyType == USD_TYPE) value /= USD_VALUE;
        if (thisCurrencyType == EURO_TYPE) value /= EURO_VALUE;

        // Convert the USD value to
        if (currencyType == USD_TYPE) rv = new USD(value*USD_VALUE);
        else if (currencyType == EURO_TYPE) rv = new Euro(value*EURO_VALUE);
        else {
            //throw new Exception(
            //    "currencyType in Currency.convertTo(int currencyType) is not a valid type: " +
            //    currencyType
            //    );
        }

        return rv;

    }

    public int typeOfCurrency() {
        
        int currencyType = -1;

        if (this instanceof USD) currencyType = USD_TYPE;
        if (this instanceof Euro) currencyType = EURO_TYPE;

        //if (currencyType == -1) {
        //    throw new Exception("Invalid Currency Type: " + this.getClass().toString());
        //}

        return currencyType;

    }

    public Currency(double valueIn) {
        setValue(valueIn);
    }

    public Currency() {
        setValue(0.0);
    }
}