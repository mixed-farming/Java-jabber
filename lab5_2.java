import java.util.Scanner;
class CurrentDate{
 int day,month,year;
 Scanner sc=new Scanner(System.in);
 void createDate(){
 day=sc.nextInt();
 month=sc.nextInt();
 year=sc.nextInt();
 }
 void display(){
 System.out.println("Current date is "+day+"/"+month+"/"+year);
 }
}
class InvalidDayException extends Exception{
 public String toString(){
 return ("Invalid day!");
 }
}
class InvalidMonthException extends Exception{
 public String toString(){
 return ("Invalid month!");
 }
}
public class lab5_2
{
public static void main(String[] args) {
CurrentDate c=new CurrentDate();
System.out.println("Enter a date in day/month/year format");
c.createDate();
try{
if(c.day<1)
throw new InvalidDayException();
switch(c.month){
 case 2:if(c.day>28)
 throw new InvalidDayException();
 break;
 case 4:
 case 6:
 case 9:
 case 11: if(c.day>30)
 throw new InvalidDayException();
 break;
 default : if(c.day>31)
 throw new InvalidDayException();
}
if(c.month>12||c.month<1)
throw new InvalidMonthException();
c.display();
}
catch(InvalidDayException err){
 System.out.println(err.toString());
}
catch(InvalidMonthException err){
 System.out.println(err.toString());
}
}
}