import java.util.*;
public class digitplay
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Enter a 3 digit number : ");
        n = sc.nextInt();
        int store[] = new int[3];
        for(int i=0;i<3;i++)
        {
            store[i]=n%10;
            n/=10;
        }
        
        if(store[2]==store[1]+store[0])
        {
            for(int j=1;j<=store[2];j++)
            {
                if(store[2]%j==0)
                System.out.print(j + " ");
            }
        }
        else
        {
            int sum = store[1]+store[0];
            System.out.print(sum);
        }
	}
}
