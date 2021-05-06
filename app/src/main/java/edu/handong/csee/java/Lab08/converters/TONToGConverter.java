package edu.handong.csee.java.Lab08.converters;

/**
 * The class to convert ton to g
 */
public class TONToGConverter implements Convertible {
	RealConvert con = new RealConvert();
    private double ton, g;

    /**
     * The method to get value
     * @param fromValue
     */
	@Override
	public void setFromValue(double fromValue) {
		con.setFromValue(fromValue);

	}

	/**
     * The method to return the converted value
     * @return g
     */
	@Override
	public double getConvertedValue() {
		ton = con.getConvertedValue();
        g = ton * 1000 * 1000;
        return g;
	}

	/**
     * The method is worthliss
     */
	@Override
	public void convert() {
		con.Convert();

	}

}
