package edu.handong.csee.java.Lab08.converters;

/**
 * The class to convert ton to kg
 */
public class TONToKGConverter implements Convertible {
	RealConvert con = new RealConvert();
    private double ton, kg;

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
     * @return kg
     */
	@Override
	public double getConvertedValue() {
		ton = con.getConvertedValue();
        kg = ton * 1000;
        return kg;
	}

	/**
     * The method is worthless
     */
	@Override
	public void convert() {
		con.Convert();

	}

}
