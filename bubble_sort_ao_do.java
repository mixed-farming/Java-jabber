import java.util.Scanner;

class bubble_sort_ao_do
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    int i,j,n;
	    int [] a = new int[30];
	    System.out.println("Enter the number of elements : ");
	    n = sc.nextInt();
	    
	    System.out.println("Populate the array : ");
	    for(i=0;i<n;i++)
	    {
	        a[i] = sc.nextInt();
	    }
	    
	    //ascending order
	    for(i=0;i<n-1;i++)
	    {
	        for(j=0;j<n-i-1;j++)
	        {
	            if(a[j+1]<a[j])
	            {
	                int temp = a[j+1];
	                a[j+1] = a[j];
	                a[j] = temp;
	            }
	        }
	    }
	    
	    //printing ascending order
	    System.out.print("\nThe ascending order of numbers : ");
	    for(i=0;i<n;i++)
	    {
	        System.out.print(a[i] + " ");
	    }
	    
	    //descending order
	    for(i=0;i<n-1;i++)
	    {
	        for(j=0;j<n-i-1;j++)
	        {
	            if(a[j+1]>a[j])
	            {
	                int temp = a[j+1];
	                a[j+1] = a[j];
	                a[j] = temp;
	            }
	        }
	    }
	    
	    //printing descending order
	    System.out.print("\n\nThe descending order of numbers : ");
	    for(i=0;i<n;i++)
	    {
	        System.out.print(a[i] + " ");
	    }

	    System.out.println("\n");
	}
}
