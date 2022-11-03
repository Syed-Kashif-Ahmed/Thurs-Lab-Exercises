package javaexamples;
import java.util.*;
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n, i, flag = 0;
		  System.out.println("Enter a positive integer: ");   // Asking the user to enter a input
		  n=s.nextInt();

		  // 0 and 1 are not prime numbers
		  // change flag to 1 for non-prime number
		  if (n == 0 || n == 1)
		    flag = 1;

		  for (i = 2; i <= n / 2; i++) {

		    // if n is divisible by i, then n is not prime
		    // change flag to 1 for non-prime number
		    if (n % i == 0) {
		      flag = 1;
		      break;
		    }
		  }

		  // flag is 0 for prime numbers
		  if (flag == 0)
			  System.out.println(n+" is a prime number.");
		  else
			  System.out.println(n+" is not a prime number.");
	
	}

}
