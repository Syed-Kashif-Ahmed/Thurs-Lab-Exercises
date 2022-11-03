package javaexamples;

public class swapnumbers {
	public static void main(String[] args) {
		int a = 10, b = 20, c; // Assigning variables with value as a=10, b=20  and an empty variable c.
		System.out.println("Before Swapping Numbers : ");
		System.out.println("A:"+a+" B:"+b); // Printing the values of a,b before swapping.
		c = a; 	// the value of a to c, i.e c=a ==> c=10;
		a = b;	// the value of a to b, i.e a=b ==> a=20;
		b = c;	// the value of b to c, i.e b=c ==> b=10;
		System.out.println("After Swapping Numbers : ");
		System.out.println("A:"+a+" B:"+b); // Printing the values of a,b After swapping.
	}
}