package javaexamples;

import java.util.*;
public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int rev=0,n,tmp,rem;
		System.out.println("Enter a number :"); // Asking the user to enter a input
		n=s.nextInt();
		tmp=n;  
		//Storing the value of user input in temporary. Because the value of n may manipulate over the program 
		while(n>0) // performing the while loop until the value of n is greater than 0.
		{
			rem=n%10;  //storing the remainder of n in rem
			rev=rev*10+rem;  // reversing the number using the remainder 
			n=n/10;  // Dividing the value of n and Storing the quotient of n in n.
		}
		if(tmp==rev)   //if the value of tmp and rev is equal. 
		System.out.println("The given number "+tmp+" is a palindrome Number");
		// This line is executed
		else
		System.out.println("The given number "+tmp+" is not a palindrome Number");	
		// else, This line is executed
		s.close();
	}

}
