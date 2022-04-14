class no_of_digits
{
    public static void main(String args[])
    { 
        int n=2529299,count=0,num;
        num=n;
        for(int i=0;n>0;i++)
        {
            n/=10;
            count++;
        }
        System.out.println("The number of digits present in " + num + " = " + count);
    }
}