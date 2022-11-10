package javaexamples;

import java.util.*;
public class StudentDetails {
	Scanner s = new Scanner(System.in);
	//Scanner for taking user input
	String s_name,s_id,grd;
	// s_name for student name, s_id for student id.
	int m[]=new int[3],avg,total;
	//m[] for taking e subject marks.
	public StudentDetails()
	{
		// Constructor for taking input details such as name,id,marks
		System.out.println("Enter a student name : ");
		s_name=s.next();
		System.out.println("Enter a student id : ");
		s_id=s.next();
		System.out.println("Enter a 3 subject marks : ");
		for(int i=0;i<3;i++)
		m[i]=s.nextInt();
		// instead of taking the 3 different variables for 3 marks
		// we are using array.
	}
	public void process()
	{
		// Method to process all the details
		for(int i=0;i<3;i++)
			total=total+m[i];
		avg=total/3;
		if(avg>=80&&avg<=100)
		grd="A";
		else if(avg>=60&&avg<80)
			grd="B";
		else
			grd="C";
	}
	public void showdetails()
	{
		//method to display all the student details.
		System.out.println("\tStudent name = "+s_name);
		System.out.println("\tStudent id = "+s_id);
		System.out.println("\tStudent total marks ="+total);
		System.out.println("\tStudent average = "+avg);
		System.out.println("\tStudent grade = "+grd);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//Scanner for taking user input
		int n;
		System.out.println("Enter the number of students : ");
		n=sc.nextInt();
		//Asking the user to input number of students and storing in variable n.
		//n defines number students for whom the details should be entered.
		StudentDetails [] s=new StudentDetails[n]; 
		// Creating array of objects.
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the following details for Student number - "+(i+1));
			s[i]=new StudentDetails();
			// Calling the constructor using the array of object.
		}
		System.out.println("\n\n");
		System.out.println("\tThe student report is");
		System.out.println("   -----------------------------------");
		for(int i=0;i<n;i++)
		{
			// Displaying all the details of students and calling the other methods using array of objects
			System.out.println("     Following details for Student number - "+(i+1));
			s[i].process();
			s[i].showdetails();	
			System.out.println();
		}
	}

}
