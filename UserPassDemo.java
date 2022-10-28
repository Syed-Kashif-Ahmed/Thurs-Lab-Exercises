package javaexamples;

import java.util.Scanner;

public class UserPassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String password, confirm_password;  // we have created to variables to accept user input and store
		Scanner d = new Scanner(System.in); // Scanner for accepting input
		System.out.println("Enter your password :"); // A message for the user to enter the password
		password = d.next(); 		// First accepting the password
		System.out.println("Re-Enter your password :");  // A message for the user to re-enter the password
		confirm_password = d.next(); // Storing the re-entered password in confirm_password
		if (password .equals(confirm_password)) // Checking whether both the passwords match
		{
			//If the condition is true this statement is executed
			//which means if both the passwords match then this statement is executed
			System.out.println("Your password matched ");
		}
		else
		{
			//If the condition is false this statement is executed
			//which means if both the passwords didn't match then this statement is executed
			System.out.println("Your password Did not matched ");
		}
	}

}
