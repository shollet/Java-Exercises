public class DecimalComparator {

	public static void main(String[] args) {
		System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
		System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
		System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
		System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));

	}
	public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {
		
		boolean isEqual = true;
		
		int firstCheck = (int) (firstNumber * 1000);
		int secondCheck = (int) (secondNumber * 1000);
		
		if (firstCheck == secondCheck) {
			return isEqual;
		} 
		
		return !isEqual;
		
	}
}
