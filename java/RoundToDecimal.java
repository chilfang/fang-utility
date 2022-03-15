package util2;

public class RoundToDecimal {
	public double roundToDecimal (double input, int decimalPlace) {
		input *= (10^decimalPlace);
		
		Math.round(input);
		
		//input /= (10^decimalPlace);
		
		return input;
	}
	
	
}
