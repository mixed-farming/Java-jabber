//decimal to binary using bitwise AND
public class bitwise4
{
	public static void main(String[] args) {
		int n=128,val=73;//give ur value for 'val'
		for(n=128;n>0;n/=2)
		{
			if((n&val)!=0)
				System.out.print("1");
			else
				System.out.print("0");
		}
	}
}