
public class NumberPalindrome {

	public static void main(String[] args) {
		System.out.println(isPalindrome(-1221));
		System.out.println(isPalindrome(707));
		System.out.println(isPalindrome(11212));
		

	}
	
	public static boolean isPalindrome(int number) {
		
		if (number < 0) 
        {
            number *= -1;
        }
		
		int reverse = 0;
		int newNumber = number;
		
		
		while (newNumber > 0) {
			int lastDigit = newNumber % 10;
			reverse = reverse * 10 + lastDigit;
			newNumber /= 10;
		}
		
		if (number == reverse) {
			return true;
		} else {
			return false;
		}
	}

}
