package util2;

public class VarOps {
	//getDigits | Outputs how many digits there are in a number as an integer.
	public static int getDigits(int num) {
		int digits = 0;
		
		while (num >= 1) {
			digits++;
			num /= 10;
		}
		
		return digits;
	}
	public static int getDigits(double num) {
		int digits = 0;
		
		while (num >= 1) {
			digits++;
			num /= 10;
		}
		
		return digits;
	}
}
