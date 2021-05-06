package edu.handong.csee.java.Lab08.converters;

/**
 * The class to convert mile to km
 */
public class MILEToKMConverter implements Convertible {
	RealConvert con = new RealConvert();
    private double mile, km;

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
     * @return km
     */
	@Override
	public double getConvertedValue() {
		mile = con.getConvertedValue();
        km = mile * 1.6;
        return km;
	}

	/**
     * The method is worthliss
     */
	@Override
	public void convert() {
		con.Convert();

	}

}
