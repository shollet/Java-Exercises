
public class LastDigitChecker {

	public static void main(String[] args) {
		System.out.println(hasSameLastDigit (41, 22, 71));
		System.out.println(hasSameLastDigit (23, 32, 42));
		System.out.println(hasSameLastDigit (9, 99, 999));
		System.out.println(isValid(10));
		System.out.println(isValid(468));
		System.out.println(isValid(1051));

	}
	
	public static boolean hasSameLastDigit(int number1, int number2, int number3) {
		if ((isValid(number1) == false) || (isValid(number2) == false) || (isValid(number3) == false)) {
			return false;
		}
		
		return ((number1 % 10 == number2 % 10) || (number1 % 10 == number3 % 10) || (number2 % 10 == number3 % 10));
	}
	
	public static boolean isValid(int number) {
		if ((number < 10) || (number > 1000)) {
			return false;
		}
		
		return true;
	}

}
