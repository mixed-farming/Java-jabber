class GCD 
{
    public static void main(String args[])
    { 
        int a=60,b=36,small,GCD=1;
        if(a<b)
        {
            small=a;
        }
        else
        {
            small=b;
        }
        
        for(int i=1;i<=small;i++)
        {
            if(a%i==0 && b%i==0)
            {
                GCD=i;
            }
        }
        
        System.out.println("The GCD of " + a + " and " + b + " is " + GCD);
    }
}