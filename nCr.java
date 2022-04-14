import java.util.Scanner;

public class nCr
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n,r;
		System.out.println("Formula for Combination = nCr\n");
		System.out.print("Enter the value of n : ");
		n=sc.nextInt();
		System.out.print("Enter the value of r : ");
		r=sc.nextInt();

		int nfac,nminusrfac,rfac;
		nfac=fact(n);
		nminusrfac=fact(n-r);
		rfac=fact(r);
		int combi = nfac / (nminusrfac*rfac);
		//System.out.print("\n\n" + rfac + "\n\n");
		System.out.println(n + "C" + r + " = " + combi);
	}

		//factorial method
		public static int fact(int x)
		{
			int fac=1;
			for(int i=x;i>=1;i--)
			{
				fac=fac*i;
				System.out.println(fac);
			}
			return(fac);
		
		}
}