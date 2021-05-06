package edu.handong.csee.java.Lab08.converters;

/**
 * The class to implements interface
 */
public class RealConvert {
	private double value;

    /**
     * The method to get value
     * @param fromValue
     */
    public void setFromValue(double fromValue) {
        value = fromValue;
    }

    /**
     * The method to return the value
     * @return value
     */
    public double getConvertedValue() {
        return value;
    }

    /**
     * The method that is worthless
     */
    public void Convert() {
        value = value;
    }
}
