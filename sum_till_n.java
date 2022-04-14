class sum_till_n 
{
public static void main(String args[])
{ 
    int n=100,sum=0;
    for(int i=1;i<=n;i++)
    {
        sum+=i;
    }
    System.out.println("The sum of first " + n + " natural numbers is " + sum);
}
}