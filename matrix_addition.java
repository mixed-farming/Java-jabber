import java.util.Scanner;

class matrix_addition
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    int [][] a = new int [10][10];
	    int [][] b = new int [10][10];
	    int [][] c = new int [10][10];
	    int m,n,p,q,i,j;
	    System.out.println("Enter the dimension of the 1st matrix : ");
	    m = sc.nextInt();
	    n = sc.nextInt();
	    System.out.println("Enter the dimension of the 2nd matrix : ");
	    p = sc.nextInt();
	    q = sc.nextInt();
	    
	    if((m!=p)||(n!=q))
	    {
	        System.out.println("\nThese two matrices cannot be added as they are of different order.");
	        System.exit(0);
	    }
	    else
	    {
	        
	        System.out.println("\nEnter the elements of 1st matrix : ");
	        for(i=0;i<m;i++)
	        {
	            for(j=0;j<n;j++)
	            {
	                a[i][j] = sc.nextInt();
	            }
	        }
	        
	        System.out.println("\nEnter the elements of 2nd matrix : ");
	        for(i=0;i<p;i++)
	        {
	            for(j=0;j<q;j++)
	            {
	                b[i][j] = sc.nextInt();
	            }
	        }
	        
	        //Addition of two matrices
	        for(i=0;i<m;i++)
	        {
	            for(j=0;j<n;j++)
	            {
	                c[i][j] = a[i][j] + b[i][j];
	            }
	        }
	        
	        //Printing the resultant matrix
	        System.out.println("\nThe resultant matrix is : ");
	        for(i=0;i<m;i++)
	        {
	            for(j=0;j<n;j++)
	            {
	                System.out.print(c[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
	}
}
