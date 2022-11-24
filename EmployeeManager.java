package javaexamples;
import java.util.*;
class members
{
	Scanner s = new Scanner(System.in);
	public int age,phone,sal;
	public String addr,name;
}
class Employee extends members
{
	String spec,dept;
	public void input()
	{
		System.out.println("Enter the Employee name :");
		name=s.next();
		System.out.println("Enter the Employee age : ");
		age=s.nextInt();
		System.out.println("Enter the Employee Salary : ");
		sal=s.nextInt();
		System.out.println("Enter the Employee Specialization : ");
		spec=s.next();
		System.out.println("Enter the Employee Department : ");
		dept=s.next();
		System.out.println("Enter the Employee Address : ");
		addr=s.next();
	}
	public void show()
	{
		System.out.println("The Employee Details are :");
		System.out.println("Employee name : "+name);
		System.out.println("Employee age : "+age);
		System.out.println("Employee Salary : "+sal);
		System.out.println("Employee Department name : "+dept);
		System.out.println("Employee Specialization : "+spec);
	}
}

class Manager extends members
{
	String spec,dept;
	public void input()
	{
		System.out.println("Enter the Manager name :");
		name=s.next();
		System.out.println("Enter the Manager age : ");
		age=s.nextInt();
		System.out.println("Enter the Manager Salary : ");
		sal=s.nextInt();
		System.out.println("Enter the Manager Specialization : ");
		spec=s.next();
		System.out.println("Enter the Manager Department : ");
		dept=s.next();
		System.out.println("Enter the Manager Address : ");
		addr=s.next();
	}
	public void show()
	{
		System.out.println("The Manager Details are :");
		System.out.println("Manager name : "+name);
		System.out.println("Manager age : "+age);
		System.out.println("Manager Salary : "+sal);
		System.out.println("Manager Department name : "+dept);
		System.out.println("Manager Specialization : "+spec);
	}
}
public class EmployeeManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee();
		Manager a = new Manager();
		e.input();
		System.out.println();
		System.out.println();
		a.input();
		System.out.println();
		System.out.println();
		e.show();
		System.out.println();
		System.out.println();
		a.show();
	}

}
