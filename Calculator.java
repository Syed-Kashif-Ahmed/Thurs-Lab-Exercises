package javaexamples;

import java.util.Scanner;
// Creating an exception class
class lessZero extends Exception
{
	public lessZero(String str)
	//Constructor for printing when the s=exception is occurred
	{
		super(str);
		System.out.println("Number should be greater than zero");
	}
}

//Main Class Calculator
public class Calculator {
public int add(int x,int y) throws lessZero
{
	if(x<=0||y<=0) //Checking condition whether the user input is equal to zero(0)	
	{
		throw new lessZero("");
	}
	return (x+y);
}
public int mul(int x,int y)throws lessZero
{
	if(x<=0||y<=0) //Checking condition whether the user input is equal to zero(0)	
	{
		throw new lessZero("");
	}
	return x*y;
}
public float div(int x,int y)throws lessZero
{
	if(x<=0||y<=0)  //Checking condition whether the user input is equal to zero(0)	
	{
		throw new lessZero("");
	}
	return x/y;
}
public double mod(int x,int y)throws lessZero
{
	if(x<=0||y<=0)  //Checking condition whether the user input is equal to zero(0)	
	{
		throw new lessZero("");
	}
	return x%y;
}
public int sub(int x,int y)throws lessZero
{
	if(x<=0||y<=0) //Checking condition whether the user input is equal to zero(0)	
	{
		throw new lessZero("");
	}
	return x-y;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//Scanner class to take input.
		Calculator cal = new Calculator();
		//Creating class object
		int ch,a,b;
		//Local integer variables for storing choice as ch, value 1 as 'a' and value 2 as 'b'.
		System.out.println("\tCalculator In Java");
		System.out.println("\t------------------");
		
		outer:  //Label to break or exit the loop
		while(true) // While loop repeating the calculation
		{
			System.out.println("\n\n\tEnter the following numbers for\n\t   1. Additon.\n\t   2. Subtraction.\n\t   3. Division");
			System.out.println("\t   4. Multiplication.\n\t   5. Modulus.\n\t   6. Exit");
			ch=sc.nextInt();  //Storing the user input in ch
			switch(ch)	//To Perform the operation based on user's choice.
			{
			case 1 :
				try {
					System.out.println("Enter two numbers :");
					a=sc.nextInt(); //accepting the value 1 in a
					b=sc.nextInt(); //accepting the value 2 in b
					System.out.println("The Additon of two numbers is "+cal.add(a,b));
					//calling the Addition method from class
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
				break; //to terminate the case.
			case 2:
				try {
					System.out.println("Enter two numbers :");
					a=sc.nextInt();
					b=sc.nextInt();
					System.out.println("The Subtraction of two numbers is "+cal.sub(a,b));
					//calling the Subtraction method from class
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
				break;
				
			case 3:
				try {
					System.out.println("Enter two numbers :");
					a=sc.nextInt();
					b=sc.nextInt();
					System.out.println("The Division of two numbers is "+cal.div(a,b));
					//calling the division method from class
					
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
				break;
			
			case 4:
				try {
					System.out.println("Enter two numbers :");
					a=sc.nextInt();
					b=sc.nextInt();
					System.out.println("The Multiplication of two numbers is "+cal.mul(a,b));
					//calling the Multiplication method from class
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
				break;
				
			case 5:
				try {
					System.out.println("Enter two numbers :");
					a=sc.nextInt();
					b=sc.nextInt();
					System.out.println("The Remainder of two numbers is "+cal.mod(a,b));
					//calling the modulus method from class
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
				break;
				
			case 6:
					break outer; //To Come out of the loop.
			default: System.out.println("Enter a valid choice");
			//If the user input is invalid this statement is printed.
				
			}
		}
		
		System.out.println("Thank You");
		//This statement is printed after coming out of the loop.
	}

}
