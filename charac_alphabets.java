class charac_alphabets
{
    public static void main(String[] args)
    {
        char ch,CH;
        System.out.println("English alphabet has 26 letters. They are : \n");
        for(ch = 'a',CH = 'A'; ch <= 'z'; ++ch,++CH)
        {
            System.out.print(ch + "" + CH + " ");
        }
    }
}