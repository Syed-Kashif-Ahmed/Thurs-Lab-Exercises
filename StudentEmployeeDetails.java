package javaexamples;
import java.util.*;

class details
{
	//class details for creating members and giving access to other classes
	Scanner s = new Scanner(System.in);
	//scanner class to take input from the user.
	public String sfname,slname,sage,scourse,sid;
	//Members for student details here s means student.
	public String efname,elname,eage,esal,eid,edept,edesig;
	//Members for Employee details here e means Employee.
}
class Studentrecord extends details
{
	//class student extends details class to access the members.
	public void getdetails()
	{
		//Method to take input
		System.out.println("Enter the Student First name :");
		sfname=s.next();
		System.out.println("Enter the Student Last name :");
		slname=s.next();
		System.out.println("Enter the Student age : ");
		sage=s.next();
		System.out.println("Enter the Student course : ");
		scourse=s.next();
		System.out.println("Enter the Student ID : ");
		sid=s.next();
	}
	public void display()
	{
		//method to display the data.
		System.out.println("The Student Details are :");
		System.out.println("Student ID : "+sid);
		System.out.println("Student first name : "+sfname);
		System.out.println("Student last name : "+slname);
		System.out.println("Student age : "+sage);
		System.out.println("Student Course : "+scourse);
		
	}
}
class Employeerecord extends details
{
	//class student extends details class to access the members.
	public void getdetails()
	{
		//Method to take input
		System.out.println("Enter the Employee First name :");
		efname=s.next();
		System.out.println("Enter the Employee Last name :");
		elname=s.next();
		System.out.println("Enter the Employee age : ");
		eage=s.next();
		System.out.println("Enter the Employee Salary : ");
		esal=s.next();
		System.out.println("Enter the Employee Department Name : ");
		edept=s.next();
		System.out.println("Enter the Employee Designation : ");
		edesig=s.next();
		System.out.println("Enter the Employee ID : ");
		eid=s.next();
	}
	public void display()
	{
		//Method to display the data
		System.out.println("The Employee Details are :");
		System.out.println("Employee ID : "+eid);
		System.out.println("Employee first name : "+efname);
		System.out.println("Employee last name : "+elname);
		System.out.println("Employee age : "+eage);
		System.out.println("Employee Salary : "+esal);
		System.out.println("Employee Department name : "+edept);
		System.out.println("Employee Designation : "+edesig);
	}
}
public class StudentEmployeeDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n,sh;
		//here n variable is used for taking the input from the user.
		//Whether he or she wants to enter details for employee or student
		Studentrecord sr = new Studentrecord();
		//Creating object for student_record.
		Employeerecord er = new Employeerecord();
		//Creating object for employee_record
		System.out.println("Enter 1 for Student Details \nEnter 2 for Employee Details.");
		n=sc.nextInt();
		//taking input
		if(n==1)
			//if the value of n is 1 then the details of student will be entered
			sr.getdetails();
		else
			er.getdetails();
			//if the value of n is 2 then the details of employee will be entered
		System.out.println("3. To Show Details");
		sh=sc.nextInt();
		//if the user enters 3 then the details are stored.
		if(sh==3)
		{
		if(n==1)
			sr.display();
		else
			er.display();
		}
		else
			System.out.println("Thank You");
		sc.close();
	}

}
