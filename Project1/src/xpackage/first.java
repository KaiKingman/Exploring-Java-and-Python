package xpackage;

public class first {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char letter = 'A';
		boolean tof = false;
		float decim = 3.33f;
		final int constantnumber = 3;
		int number = 5;
		int sum1 = constantnumber + number;
		byte bite = 60; 
		long bigbite = 15000000000L;
		double prodecim = 0.99999d;
		float decim2 = sum1;
		double decim3 = number;
		int adecim = (int) decim;
		
		String testmessage = "This is a test.";
		System.out.println(testmessage);
		System.out.println(number);
		System.out.println(constantnumber + " will not change.");
		
		if (tof == true) { 
			System.out.println(letter + " and " + decim);
		} 
		else {
			System.out.println("Nothing here.");
		}
		
		System.out.println(sum1);
		System.out.println(bite + bigbite);
		System.out.println(prodecim);
		System.out.println(decim2);
		System.out.println(decim3);
		System.out.println(adecim);
	}

}
	