//turning off a bit using bitwise AND and bitwise NOT
import java.util.Scanner;

public class bitwise1
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,k;
        System.out.print("Enter a number : "); 
        n=sc.nextInt();
        System.out.print("Which bit do you wish to turn off? : ");
        k=sc.nextInt();
        System.out.println("\nResult : " + turnoff(n,k) + "\n");
    }

    //method
    public static int turnoff(int n,int k)
    {
        if(k<=0)
        return n;
    return(n & ~(1<<(k-1)));
    }
}
    


