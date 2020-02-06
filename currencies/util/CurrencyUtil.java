package currencies.util;

public final class CurrencyUtil {
    public static double round(double value, int placesAfterDecimal) {
        double rv;

        rv = Math.round(value*placesAfterDecimal);
        rv /= placesAfterDecimal;

        return rv;
    }

}