package primeNumberCheck;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
				// Scanner object
				Scanner myObj = new Scanner(System.in);
				// Prompt user
				System.out.println("Please enter a number to check if it is prime or not");
				int n = myObj.nextInt();
				myObj.close();
				PrimeChecker obj = new PrimeChecker();
				obj.display(n);
	}

}
