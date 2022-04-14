public class generic_swap
{
    static <T>
    void swap(T[] a,int i,int j)
    {
        T t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
    public static void main(String args[])
    {
        String a[] = {"it","is","marvellous"};
        System.out.println("Before swapping : ");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        swap(a,0,2);
        Integer b[]={23,34,78,56,67,45};
        for(int i=0;i<b.length;i++)
        {
            System.out.print(b[i]+" ");
        }
        swap(b,2,5);
        System.out.println("\nAfter swapping :");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        for(int i=0;i<b.length;i++)
        {
            System.out.print(b[i]+" ");
        }
        System.out.println();
    }
}