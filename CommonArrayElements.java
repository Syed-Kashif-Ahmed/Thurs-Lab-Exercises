package javaexamples;

public class CommonArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Arrays with different elements.
		int a[]= {10,20,30,40,50,60};
		int b[]= {10,20,80,60,50,30};
		int c[]=new int[a.length]; 
		//Assigning the length of array 'a' to 'c' and declaring and instantiating array 'c'.
		int n=0;
		
		// nested loops for checking the similar elements.
		for(int i=0,k=0;i<a.length;i++)
		{ 
			for(int j=0;j<a.length;j++)
			{
				if(a[i]==b[j]) 
				// checking the elements of array a and b.
				// if the elements match.
				{
					c[k++]=a[i];
					//The elements which are similar are stored in another array c.
					n++; 
					//As we declared the length of array 'c' as same as the length of array 'a'.
					// when we try to print the array 'c', it will 0 if the array is empty.
					// so we are incrementing the value of n by 1, every time there is a similar element
				}
				
			}
				
		}
		//Then we are printing the array..
		System.out.println("common elements are...");
		for(int i=0;i<n;i++)
		{
			System.out.print(c[i]+" ");
		}
	}

}
