package javaexamples;

import java.util.Scanner;

public class EvenOddDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n; // Creating a variable n of integer type
		Scanner s = new Scanner(System.in); // Scanner for accepting input
		System.out.println("Enter a value : ");  // A message for the user to enter a value
		n = s.nextInt();  // storing the user input in variable a
		if (n % 2 == 0) 
		// the input of the user is stored in n..n is divided by 2 and if the remainder is 0 then it is even else odd
			System.out.println("The given number " + n + " is even"); 
			//If the condition is true this statement is executed
		else
			System.out.println("The given number " + n + " is odd");
			//If the condition is false this statement is executed
	}

}
