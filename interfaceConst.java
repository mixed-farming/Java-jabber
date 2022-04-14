interface Iconst{
int MIN = 0;
int MAX = 10;
String ERRORMSG = "Boundary Error";
}

public class interfaceConst implements Iconst 
{
	public static void main(String[] args) 
	{
		int [] nums = new int[MAX];
		for(int i =MIN; i<= MAX; i++)
		{
			if (i>=MAX)
			System.out.println(ERRORMSG);
			else 
			{
				nums[i] = i;
				System.out.print(nums[i]+ " ");
			}
		}
	} 
}
