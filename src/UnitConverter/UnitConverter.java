package UnitConverter;

public class UnitConverter {

    public static final double KILOGRAMS_PER_POUND = 0.45359237;
    public static final double POUNDS_PER_KILOGRAM = 1 / KILOGRAMS_PER_POUND;
    public static final double CENTIMETERS_PER_INCH = 2.54;
    public static final double INCHES_PER_CENTIMETER = 1 / CENTIMETERS_PER_INCH;

    public static double toPounds(double kilograms) {
        return POUNDS_PER_KILOGRAM * kilograms;
    }

    public static double toKilograms(double pounds) {
        return KILOGRAMS_PER_POUND * pounds;
    }

    public static double toCentimeters(double inches) {
        return CENTIMETERS_PER_INCH * inches;
    }

    public static double toInches(double centimeters) {
        return INCHES_PER_CENTIMETER * centimeters;
    }

    public static double toFahrenheit(double celsius) {
        return celsius * ((double)9 / 5) + 32;
    }

    public static double toCelsius(double fahrenheit) {
        return (fahrenheit - 32) * ((double)5 / 9);
    }
}