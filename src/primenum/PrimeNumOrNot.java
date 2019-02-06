package primenum;

import java.util.Scanner;

public class PrimeNumOrNot {

	public static void main(String[] args) {
		
		System.out.print("Please enter a number: ");
		
		//Since our method/function is 'static' we don't need to create a new class object.
		//PrimeNumFunctions fn = new PrimeNumFunctions();
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		boolean b = PrimeNumFunctions.isPrimeNumber(num); //default constr - classname.methodname(parameter)
		
		System.out.println(num + " is a Prime Number: " + b);
		
		sc.close();
		
		
		
		
		
		

	}

}
