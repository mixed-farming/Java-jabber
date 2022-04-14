import java.util.Scanner;
class lab3_2
{
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a string");
String t=sc.nextLine();
StringBuffer s=new StringBuffer(t); //making use of the StringBuffer class’s insert 
System.out.println("Input string: "+t); //method as strings are immutable
int l=s.length();
System.out.println(l);
for(int i=l%3;i<l;i+=4)
s.insert(i,','); //inserting the commas from the
if(s[l-1]=',')
s[l-1]=' ';
System.out.println("The output string: "+s); //left exculding the remainder
}
}
