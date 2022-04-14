import java.util.*;

class Test {
int a, b;
Test(int i, int j) { a = i; b = j;}
// pass an object
void swap(Test o) {
int temp;
temp = o.a;
o.a = o.b;
o.b = temp;} 
}
public class callbyref{
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
int a,b;
System.out.print("Enter the values of a and b : ");
a=sc.nextInt();
b=sc.nextInt();
Test ob = new Test(a,b);
System.out.println("ob.a and ob.b before call: "+ob.a+" "+ob.b);
ob.swap(ob);
System.out.println("ob.a and ob.b after call: "+ob.a + " "+ob.b);
} 
}