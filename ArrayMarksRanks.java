package javaexamples;

public class ArrayMarksRanks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mrk[]= {100,88,89,80,90,95};
		//An array mrk with all marks which shuffled.
		int rnk[]= {1,2,3,4,5,6};
		//An array rnk with ranks assigned in order.
		int n= mrk.length;
		//Assigning the length of the array 'mrk' in variable n.
		int tmp; 
		//A temporary variable for swapping or sorting the array according to ranks.
//		int lar,sml;
		
		for(int i=0;i<n-1;i++)
			//ith loop traversing to all the elements of array 'mrk'.
		{
				if(mrk[i]>mrk[i+1]) 
					//comparing if the element present at i index is greater than
					//the element present at i+1
				{
					//if the condition is true the element which is small is placed at at first.
					tmp=mrk[i];
					mrk[i]=mrk[i+1];
					mrk[i+1]=tmp;
				}
		}
		System.out.println("Marks - Rank");
		for(int i=n-1,k=0;i>=0;i--)
			//The array will be in ascending order.
			//so we are revering and printing the array in descending order.
		{
			System.out.println(mrk[i]+"   -   "+rnk[k]);
			// Printing the array with rank.
			k++;
			//incrementing the value of k to 1 every time
			//to print all the ranks.
		}
	}

}
