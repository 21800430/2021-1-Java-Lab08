package edu.handong.csee.java.Lab08.converters;

/**
 * class
 */
public interface Convertible {
	/**
     * method
     * @param fromValue
     */
    public void setFromValue(double fromValue);
    /**
     * method
     * @return double
     */
    public double getConvertedValue();
    /**
     * method
     */
    public void convert();
}
