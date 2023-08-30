public class BarkingDog {

	public static void main(String[] args) {
		System.out.println(shouldWakeUp (true, 1));
		System.out.println(shouldWakeUp (false, 2));
		System.out.println(shouldWakeUp (true, 8));
		System.out.println(shouldWakeUp (true, -1));

	}
	
	public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
		
		if (barking == false) {
			return barking;
		}
		
		if ((hourOfDay < 0) || (hourOfDay > 23)) {
			barking = false;
		} else if ((hourOfDay < 8) || (hourOfDay > 22)) {
			barking = true;
		} else {
			barking = false;
		}
		return barking;
	}

}
