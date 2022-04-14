import java.util.*;
public class inverted_triangle
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,i,j,k;
		System.out.println("Enter the number of rows : ");
		n = sc.nextInt();
		for(i=0;i<n;i++)
		{
			for(k=0;k<i;k++)
			{
				System.out.print(" ");
			}
			for(j=0;j<2*(n-i);j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
