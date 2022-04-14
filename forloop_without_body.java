class forloop_without_body
{
        public static void main(String a[] )
        {
            int total=0;
            for(int x =0, y =0; x+y <10; total += x++ + y++)
            {}

            System.out.println(total);
        }
}