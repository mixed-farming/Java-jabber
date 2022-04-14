import java.util.*;

public class linear_search
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,i,flag=0;
        System.out.print("Enter the length of the 1d array : ");
        n=sc.nextInt();
        int a[]=new int[n];

        for(i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }

        int ele,pos=0;
        System.out.print("\nEnter the element to be searched : ");
        ele = sc.nextInt();

        for(i=0;i<n;i++)
        {
            if(a[i]==ele)
                {
                    flag=1;
                    pos=i;
                }
        }

        pos++;
        if(flag==1)
        {
            System.out.println("\nSearch successful. " + ele + " found at position " + pos + ".\n");
        }
        else
            System.out.println("\nUnsuccessful search. " + ele + " not found in the array.\n");
    }
}