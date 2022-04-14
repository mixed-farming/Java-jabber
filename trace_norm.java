import java.util.*;

public class trace_norm
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int m,n,i,j;
		System.out.println("Enter the dimensions of the matrix : ");
		m=sc.nextInt();
		n=sc.nextInt();
		int a[][] = new int[m][n];

		if (m!=n)
		{
			System.out.println("Trace and norm is defined only for a square matrix.");
			System.exit(0);
		}

		System.out.println("Enter the elements of the matrix : ");
		for (i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}


		int trace=0,sum=0;
		double norm=0.0;
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				sum+=a[i][j]*a[i][j];
				if(i==j)
					trace+=a[i][j];
			}
		}

		norm = Math.sqrt(sum);
		System.out.println("Trace of the matrix = " + trace + "\nNorm of the matrix = " + norm);
	}
}