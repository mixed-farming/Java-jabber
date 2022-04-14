import java.util.Scanner;
public class digitsum
{
	public static void main(String[] args) 
	{
			Scanner sc = new Scanner(System.in);
			int n;
			System.out.print("Enter a long number : ");
			n = sc.nextInt();
			System.out.print("Sum of digits of " + n + " = " + findsum(n));
	}

	public static int findsum(int x)
	{
		int sum=0;
		while(x>0)
		{
			sum+=(x%10);
			x/=10;
		}
		return(sum);
	}
}