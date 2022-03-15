package util2;

public class BinaryConversion {
	public static int toBase10(int binaryInp) {
		int[] input = ArrayOps.toArr(binaryInp);
		int length = VarOps.getDigits(binaryInp);
		int temp = 0;
		
		for (int i = 0; i < length; i++) {
			if (input[i] == 1) {
				temp += Math.pow(2, (length-1)-i);
			}
		}
		
		return temp;
	}
	public static int toBase2(int inp) {
		int counter = 0;
		int[] outputArr = {};
		int output = 0;
		
		while (inp - Math.pow(2, counter) >= 0) {
			counter++;
		}
		
		while (counter >= 0) {
			if (inp - Math.pow(2, counter) >= 0) {
				inp -= Math.pow(2, counter);
				outputArr = ArrayOps.append(outputArr, 1);
			} else {
				outputArr = ArrayOps.append(outputArr, 0);
			}
			counter--;
		}
		
		outputArr = ArrayOps.reverse(outputArr);
		output = ArrayOps.toVar(outputArr);
		
		return output;
	}
	public static String toBase2String(int inp) {
		int counter = 0;
		int[] outputArr = {};
		int output = 0;
		
		while (inp - Math.pow(2, counter) >= 0) {
			counter++;
		}
		
		while (counter >= 0) {
			if (inp - Math.pow(2, counter) >= 0) {
				inp -= Math.pow(2, counter);
				outputArr = ArrayOps.append(outputArr, 1);
			} else {
				outputArr = ArrayOps.append(outputArr, 0);
			}
			counter--;
		}
		
		outputArr = ArrayOps.reverse(outputArr);
		output = ArrayOps.toVar(outputArr);
		
		return Integer.toString(output);
	}
}
