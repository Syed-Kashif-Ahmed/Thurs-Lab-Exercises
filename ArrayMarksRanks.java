package javaexamples;

import java.util.*;
public class ArrayMarksRanks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		//Scanner to input from the user
		int n,i,j,temp;
		// variable n for taking the size of the array/marks.
	    // variable i and j for looping.
		// variable temp which serves as temporary variable used while swapping.
		System.out.println("Enter the number of marks : ");
		n=s.nextInt();
		// Asking the user to input number marks to be enter and storing in variable n.
		int mrk[]= new int[n];
		// mrk is instantiated with the size n.
		int rnk[]=new int[n];
		// rnk is instantiated with the size n.
		for(i=0;i<n;i++)
		{
			//storing the ranks for number of marks the user enters.
			//How ranks are to be stored are depended on the size of the mrk array.
			rnk[i]=i+1;
		}
		System.out.println("Enter the marks : ");
		for(i=0;i<n;i++)
			mrk[i]=s.nextInt();
		// Asking the user to enter the marks.
		
		//Nested loop for testing/checking.
		for(i=0;i<n;i++)
		{
			for(j=0;j<n-i-1;j++)
			{
				//Basically these loops sort the marks in descending order.
				if(mrk[j]<mrk[j+1])
				{
					temp=mrk[j];
					mrk[j]=mrk[j+1];
					mrk[j+1]=temp;
				}
			}
		}
		//Printing all the marks which are sorted higher to lower marks and rank.
		System.out.println("Marks - Rank");
		for(i=0;i<n;i++)
	    System.out.println(mrk[i]+"   -   "+rnk[i]);
		s.close();
	}

}
