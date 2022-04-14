import java.util.*;
public class isArmstrong
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Enter a number : ");			
		n = sc.nextInt();

		if(isarmstrong(n))
		{
			System.out.println(n + " is an armstrong number.");
		}
		else
		{
			System.out.println(n + " is not an armstrong number.");			
		}
	}
//checker method
	public static boolean isarmstrong(int x)
	{
		int temp = x,sum=0,digit,cube;
		while(x>0)
		{
			digit = x%10;
			cube = digit * digit * digit;
			sum = sum + cube;
			x/=10;
		}
		if (temp==sum)
			return(true);
		else
			return(false);
	}
}