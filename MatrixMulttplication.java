package javaexamples;

public class MatrixMulttplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{1,2,3},{1,2,3},{1,2,3}};
		//2 Dimensional array with 3 rows and 3 columns.
		int b[][]= {{1,2,3},{1,2,3},{1,2,3}};
		//2 Dimensional array with 3 rows and 3 columns.
		int c[][]=new int[a.length][b.length];
		//Another array to multiply the two arrays 'a' and 'b'.
		
		//Nested loops.
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				c[i][j]=0;
				//assigning the value as 0 for the row and column.
				for(int k=0;k<a.length;k++)
				{
					c[i][j]=c[i][j]+a[i][k]*b[k][j];
				}
			}
		}
		
		
		// printing the final array.
		// which has the result of multiplication.
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	
		
	}

}
