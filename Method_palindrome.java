class Method_palindrome 
{
    public static void main(String args[])
    { 
        int num=13531;
        
        if(ispalindrome(num))
        {
            System.out.println(num + " is a palindrome.");
        }
        else
        {
           System.out.println(num + " is not a palindrome."); 
        }
    }
    
    public static boolean ispalindrome(int number)
    {
        int n = number;
        int reverse = 0;
        
        while(n!=0)
        {
            reverse = reverse*10 + (n%10);
            n/=10;
        }
        
        
        if(number==reverse)
        {
            return(true);
        }
        else
        {
            return(false);
        }
    }
}