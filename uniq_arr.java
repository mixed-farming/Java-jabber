import java.util.*;
public class uniq_arr
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = {4,3,2,5,1,6,2,1,4,5,9};
		for(int i=2;i<arr.length;i++)
		{
		    if (arr[i]==arr[i-1]+arr[i-2])
		    System.out.println(arr[i]);
		}

	}
}
