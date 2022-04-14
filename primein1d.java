import java.util.*;

public class primein1d
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Enter the number of elements in the array : ");
		n = sc.nextInt();
		int a [] = new int [n];

		System.out.println("Populate the array : ");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}

		System.out.println("Prime numbers in the given array are : ");
		for(int i=0;i<n;i++)
		{
			int flag=1;
			for(int j=2;j<=Math.sqrt(a[i]);j++)
			{
				if(a[i]%j==0)
					flag=0;
			}
			if(flag==1&&a[i]>1)
			{
				System.out.print(a[i] + " ");
			}
		}
	}
}