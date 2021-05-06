package edu.handong.csee.java.Lab08.converters;

/**
 * The class to convert km to m
 */
public class KMToMConverter implements Convertible {
	RealConvert con = new RealConvert();
    private double km, m;
    
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
     * @return m
     */
	@Override
	public double getConvertedValue() {
		km = con.getConvertedValue();
        m = km * 1000;
        return m;
	}

	/**
     * The method is worthliss
     */
	@Override
	public void convert() {
		con.Convert();

	}

}
