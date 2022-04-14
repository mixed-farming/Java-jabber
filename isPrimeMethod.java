import java.util.Scanner;

class isPrimeMethod
{
    //main function
    public static void main(String[] args) 
    {
        int N,count=0,k=2,j=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit : ");
        N = sc.nextInt();
        System.out.println("First " + N + " prime numbers are : ");
        while(count<N)
        {
            if(isPrime(k))
            {
                System.out.print(k + " ");
                count++;
            }
            
            k++;
        }  
        
    }
    
    //method
    public static boolean isPrime(int n)
    {
        int flag=1;
        System.out.printf(j);
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                flag=0;
                break;
            }
        }
        if(flag==1)
        {
            return(true);
        }
        else
        {
            return(false);
        }
    }
}