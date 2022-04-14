class PrimeNumbersInLimits 
{
    public static void main(String args[])
    { 
        int a=2,b=100;
        System.out.print("The prime numbers between " + a + " and " + b + " are : ");
        for(int i=a;i<=b;i++)
        {
            int flag = 1;
            for(int j=2;j<=Math.sqrt(i);j++)
            {
                if(i%j==0)
                {
                    flag = 0;
                    break;
                }
            }
            
            if(flag == 1)
            {
                System.out.print(i + " ");
            }
        }
    }
}