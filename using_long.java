class using_long
{
    public static void main (String args[])
    {
        long mm,km=1,cubic_mm;//if the variables were of int type then they print some negative garbage value
        mm = km * 1000 * 100 * 10;
        cubic_mm = mm * mm * mm;
        System.out.println("One cubic mm = " + cubic_mm);
    }
}