import java.util.Scanner;
public class strex1
{
public static void main(String args[])
{
String temp;
Scanner sc = new Scanner(System.in);
System.out.println("What's the temp. state of the heater (high/low) : ");
temp = sc.nextLine();
switch(temp) {
case "high":
System.out.println("Switch off the heater");
break;
case "low": 
System.out.println("wait"); 
break;
}
}
}
