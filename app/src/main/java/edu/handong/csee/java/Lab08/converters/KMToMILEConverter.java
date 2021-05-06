package edu.handong.csee.java.Lab08.converters;

/**
 * The class to convert km to mile
 */
public class KMToMILEConverter implements Convertible {
	RealConvert con = new RealConvert();
    private double km, mile;

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
     * @return mile
     */
	@Override
	public double getConvertedValue() {
		km = con.getConvertedValue();
        mile = km / 1.6;
        return mile;
	}

	/**
     * The method is worthliss
     */
	@Override
	public void convert() {
		con.Convert();

	}

}
