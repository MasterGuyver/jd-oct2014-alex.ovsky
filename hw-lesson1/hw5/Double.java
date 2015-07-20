package hw5;

public class Double {

	public static void main(String[] args) {
		double value = 25.6;
		String svalue = String.valueOf(value);
		int separator = svalue.indexOf(".");
		int integ = Integer.parseInt(svalue.substring(0, separator));
		int frac = Integer.parseInt(svalue.substring(separator + 1));
		System.out.println(integ);
		System.out.println(frac);
	}

}
