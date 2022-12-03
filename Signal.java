import java.util.*;
public class Signal extends Thread {
	int n,k=1;
	public void run()
	{
	     System.out.print(" ");
	}
	public void red()
	{
	      System.out.println();
	      System.out.println("Round "+(k++));
	      System.out.println();
	      System.out.print("Red : ");
	      System.out.print("\nTime Remaining :\n");
	       n=3;
	      try{      
	           while(n>0){
	           System.out.println(n--);
	            Thread.sleep(1000);
	           }
	      }
	      catch(InterruptedException e)
	      {
	            System.out.println(e);
	      }
	      System.out.println();
	      green();
	}

      public void green()
	{
	      System.out.print("Green : ");
	      System.out.print("\nTime Remaining :\n");
	       n=5;
	      try{      
	           while(n>0){
	           System.out.println(n--);
	            Thread.sleep(1000);
	           }
	      }
	      catch(InterruptedException e)
	      {
	            System.out.println(e);
	      }
	      System.out.println();
	      yellow();
	}
	
	public void yellow()
	{
	      System.out.print("Yellow : ");
	      System.out.print("\nTime Remaining :\n");
	       n=2;
	      try{      
	           while(n>0){
	           System.out.println(n--);
	            Thread.sleep(1000);
	           }
	      }
	      catch(InterruptedException e)
	      {
	            System.out.println(e);
	      }
	      red();
	}
	
	public static void main(String[] args) {
		System.out.println("Wait for the signals");
		Scanner sc = new Scanner (System.in);
		Signal s = new Signal ();
		s.red();
		s.start();
		/*System.out.println("Enter the number of times you want to repeat the signal : ");
		int n=sc.nextInt();
		int k=1;
		while(n>0)
		{
		  System.out.println();
		  System.out.println("Round "+k++);
		  System.out.println();
		  System.out.println("Signal :");
		s.red();
		n--;
		}*/
	}
}