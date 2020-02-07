package tests.currencies;

import currencies.types.USD;

/**
 * @author Kyle Bye
 */
public class USDTest {
    public static void main(String[] args) {
        USD zero = new USD();
        USD a = new USD(10.1);
        USD b = new USD(20.9);
        USD c = new USD(-100);

        // Print out every instance along with it's value.
        System.out.format("zero = %s\n", zero);
        System.out.format("a = %s\n", a); 
        System.out.format("b = %s\n", b);
        System.out.format("c = %s\n", c);

        // Addition
        System.out.format("a + b = %s\n", a.add(b));
        System.out.format("c + a = %s\n", c.add(a));

        // Subtraction
        System.out.format("c - a = %s\n", c.subtract(a));
        System.out.format("a - c = %s\n", a.subtract(c));
    }
}