package primenum;

public class PrimeNumFunctions {

	// Note: 2 is the lowest prime number

	// This function-method will return True or False
	public static boolean isPrimeNumber(int num) {

		// If the number is less than equal to 1 then return False
		if (num <= 1) {
			return false;
		}

		for (int i = 2; i < num; i++) {

			// If the remainder equal to 0 then get out the for loop and return True
			if (num % i == 0) {
				return false;
			}
		}

		return true;
	}

	
	//This Function-Method will print all the prime numbers from 2 to the num you provided
	public static void getPrimeNumbers(int num) {
		
		System.out.println("Prime numbers between 2 to " + num + " are: ");
		
		for (int i = 2; i <= num; i++) {
			if (isPrimeNumber(i))
				System.out.print(i + " ");
		}
	}
}
