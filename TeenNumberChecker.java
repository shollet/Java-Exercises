public class TeenNumberChecker {

	public static void main(String[] args) {
		System.out.println(hasTeen(9, 99, 19));
		System.out.println(hasTeen(23, 15, 42));
		System.out.println(hasTeen(22, 23, 34));


	}
	
	public static boolean hasTeen(int firstNumber, int secondNumber, int thirdNumber){
        return isTeen(firstNumber) || isTeen(secondNumber) || isTeen(thirdNumber);
    }
 
    public static boolean isTeen(int checkNumber){
        return ((checkNumber >= 13) && (checkNumber <= 19));
    }

}
