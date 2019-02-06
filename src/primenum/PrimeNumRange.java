package primenum;

import java.util.Scanner;

public class PrimeNumRange {

	public static void main(String[] args) {
		
		System.out.print("Please enter a number: ");
		
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		PrimeNumFunctions.getPrimeNumbers(num);
		
		sc.close();
		

	}

}
