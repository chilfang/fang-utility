package util2;

//Array Operations
public class ArrayOps {
	//findMin | finds the smallest value in the array.
	public static int findMin (int[] arr) {
		int temp = arr[0];
		for (int i : arr) {if (i < temp) {temp = i;}}
		return temp;
	}
	public static double findMin (double[] arr) {
		double temp = arr[0];
		for (double i : arr) {if (i < temp) {temp = i;}}
		return temp;
	}
	
	//findMin | finds the largest value in the array.
	public static int findMax (int[] arr) {
		int temp = arr[0];
		for (int i : arr) {if (i > temp) {temp = i;}}
		return temp;
	}
	public static double findMax (double[] arr) {
		double temp = arr[0];
		for (double i : arr) {if (i > temp) {temp = i;}}
		return temp;
	}

	//remove | Removes the given variable from the array.
	public static int[] remove (int[] arr, int input) {
		int[] tempArr = {};
		for (int i : arr) {if (i != input) {tempArr = append(tempArr, i);}}
		return tempArr;
	}
	public static Integer[] remove (Integer[] arr, int input) {
		Integer[] tempArr = {};
		for (int i : arr) {if (i != input) {tempArr = append(tempArr, i);}}
		return tempArr;
	}
	public static double[] remove (double[] arr, double input) {
		double[] tempArr = {};
		for (double i : arr) {if (i != input) {tempArr = append(tempArr, i);}}
		return tempArr;
	}
	public static Double[] remove (Double[] arr, double input) {
		Double[] tempArr = {};
		for (double i : arr) {if (i != input) {tempArr = append(tempArr, i);}}
		return tempArr;
	}
	public static String[] remove (String[] arr, String input) {
		String[] tempArr = {};
		for (String i : arr) {if (i != input) {tempArr = append(tempArr, i);}}
		return tempArr;
	}
	
	//reverse | Reverses the array.
	public static int[] reverse(int[] arr) {
		int[] temp = {};
		
		for(int i = arr.length-1; i >= 0; i--) {
			temp = append(temp, arr[i]);
		}
		
		return temp;
	}
	public static Integer[] reverse(Integer[] arr) {
		Integer[] temp = {};
		
		for(int i = arr.length-1; i >= 0; i--) {
			temp = append(temp, arr[i]);
		}
		
		return temp;
	}
	public static double[] reverse(double[] arr) {
		double[] temp = {};
		
		for(int i = arr.length-1; i >= 0; i--) {
			temp = append(temp, arr[i]);
		}
		
		return temp;
	}
	public static Double[] reverse(Double[] arr) {
		Double[] temp = {};
		
		for(int i = arr.length-1; i >= 0; i--) {
			temp = append(temp, arr[i]);
		}
		
		return temp;
	}
	public static String[] reverse(String[] arr) {
		String[] temp = {};
		
		for(int i = arr.length-1; i >= 0; i--) {
			temp = append(temp, arr[i]);
		}
		
		return temp;
	}
	
	//toArr | Converts a variable into an array putting each digit into a different part of the array.
	public static int[] toArr(int input) {
		int length = VarOps.getDigits(input);
		int digits[] = {};
		
		for(int i = 0; i < length; i++) {
			digits = append(digits, input % 10);
			input = input / 10;
		}
		
		digits = ArrayOps.reverse(digits);
		
		return digits;
	}
	public static double[] toArr(double input) {
		double length = VarOps.getDigits(input);
		double digits[] = {};
		
		for(int i = 0; i < length; i++) {
			digits = append(digits, input % 10);
			input = input / 10;
		}
		
		digits = ArrayOps.reverse(digits);
		
		return digits;
	}
	
	//toVar | Converts the array into an single variable based on the order of the numbers in the array. Will return zero by default.
	public static int toVar(int[] inputArr) {
		int output = 0;
		for (int i = 0; i < inputArr.length; i++) {output += inputArr[i] * Math.pow(10, i);}
		return output;
	}
	
	//print | Prints the array as if it was put in a for loop.
	public static void print (int[] arr) {for (int i : arr) {System.out.print(i);}}
	public static void print (int[] arr, String inpString) {for (int i : arr) {System.out.print(i + inpString);}}
	public static void print (Integer[] arr) {for (int i : arr) {System.out.print(i);}}
	public static void print (Integer[] arr, String inpString) {for (int i : arr) {System.out.print(i + inpString);}}
	public static void print (double[] arr) {for (double i : arr) {System.out.print(i);}}
	public static void print (double[] arr, String inpString) {for (double i : arr) {System.out.print(i + inpString);}}
	public static void print (Double[] arr) {for (double i : arr) {System.out.print(i);}}
	public static void print (Double[] arr, String inpString) {for (double i : arr) {System.out.print(i + inpString);}}
	public static void print (String[] arr) {for (String i : arr) {System.out.print(i);}}
	public static void print (String[] arr, String inpString) {for (String i : arr) {System.out.print(i + inpString);}}
	
	//println | Same as print but with each prints on a new line each time.
	public static void println (int[] arr) {for (int i : arr) {System.out.println(i);}}
	public static void println (Integer[] arr) {for (int i : arr) {System.out.println(i);}}
	public static void println (double[] arr) {for (double i : arr) {System.out.println(i);}}
	public static void println (Double[] arr) {for (double i : arr) {System.out.println(i);}}
	public static void println (String[] arr) {for (String i : arr) {System.out.println(i);}}
	
	//append | This adds the given variable to the end of the array.
	public static int[] append(int[] arr, int var) {
		int[] temp = new int[arr.length+1];
		for (int i = 0; i < arr.length; i++) {temp[i] = arr[i];}
		temp[arr.length] = var;
		return temp;
	}
	public static Integer[] append(Integer[] arr, int var) {
		Integer[] temp = new Integer[arr.length+1];
		for (int i = 0; i < arr.length; i++) {temp[i] = arr[i];}
		temp[arr.length] = var;
		return temp;
	}
	public static double[] append(double[] arr, double var) {
		double[] temp = new double[arr.length+1];
		for (int i = 0; i < arr.length; i++) {temp[i] = arr[i];}
		temp[arr.length] = var;
		return temp;
	}
	public static Double[] append(Double[] arr, double var) {
		Double[] temp = new Double[arr.length+1];
		for (int i = 0; i < arr.length; i++) {temp[i] = arr[i];}
		temp[arr.length] = var;
		return temp;
	}
	public static String[] append(String[] arr, String var) {
		String[] temp = new String[arr.length+1];
		for (int i = 0; i < arr.length; i++) {temp[i] = arr[i];}
		temp[arr.length] = var;
		return temp;
	}

 

}









