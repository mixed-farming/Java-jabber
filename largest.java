import java.util.Scanner;

public class largest
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		System.out.print("Enter the first number : ");
		a = sc.nextInt();
		System.out.print("Enter the second number : ");
		b = sc.nextInt();
		System.out.print("Enter the third number : ");
		c = sc.nextInt();

		System.out.print("The largest number is : " + large(a,b,c));
	}

	//large method
	public static int large(int a,int b,int c)
	{
		int great,inter;
		inter = a > b ? a : b ;
		great = inter > c ? inter : c ;
		return great;
	}
}