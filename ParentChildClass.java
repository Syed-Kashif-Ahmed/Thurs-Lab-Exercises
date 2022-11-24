package javaexamples;

class parent
{
	//Parent class to print this is a Parent class.
	public void p()
	{
		System.out.println("This is a parent class");
	}
}
class child extends parent
{
	//Child class to print this is a Child class.
	public void c()
	{
		System.out.println("This is a child class");
	}
}

public class ParentChildClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parent pc = new parent();
		//Creating the object of parent class.
		child cc = new child();
		//Creating the object of child class.
		parent pcp = new child();
		//Creating the object parent class by instantiating child class.
		System.out.println("calling the parent method using Parent Object");
		pc.p();
		//calling the parent method using Parent Object
		System.out.println();
		System.out.println("calling the child method using Child Object");
		cc.c();
		//calling the child method using Child Object
		System.out.println();
		System.out.println("calling the Parent method using Child Object");
		pcp.p();
		//calling the Parent method using Child Object
		pc=cc;
		//assigning child object to parent object
		System.out.println();
		System.out.println("calling the Parent method by assigning the child object to parent object");
		cc.p();
		
	}

}
