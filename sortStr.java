//bubble sort
import java.util.*;
public class sortStr
{
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Enter the number of strings : ");
		n = sc.nextInt();
		sc.nextLine();/*It's because when you enter a number then press Enter, input.nextInt() consumes only the number, not the "end of line".The cursor will remain next to number input. When input.nextLine() executes, it consumes the "end of line" still in the buffer from the first input.*/
		String strs[] = new String[n];
		System.out.println("Enter the strings : ");
		for(int i=0;i<n;i++)
		{
		strs[i]=sc.nextLine();//sc.next() could also be used where a space acts as escaping sequence but not line as in sc.nextLine()
		}
		for(int i=0;i<n;i++)
		{
		System.out.println("strs["+i+"] =" + strs[i]);
		}

		for(int i=0;i<n;i++)
		{
		    String temp;
		    for(int j=0;j<n-i-1;j++)
		    {
		        if(strs[j].compareTo(strs[j+1])>0)
		        {
		            temp = strs[j];
		            strs[j] = strs[j+1];
		            strs[j+1]= temp;
		        }
		    }
		}
		System.out.println("Sorted order of Strings : ");
		for(String s : strs)
                System.out.print(s + " "); 
	}
}