 import java.util.*;
 class Student{
 static int count=0;
 int regno;
 GregorianCalendar date_of_joining;
 String full_name;
 short semester;
 float GPA,CGPA;
 static Scanner sc=new Scanner(System.in);
 
 //1. Providing a parametrized constructor to the class
 Student(int year,int month,int day,String name,short sem,float 
gpa,float cgpa){
 ++count;
 regno=(year%100)*100+count+1;
 date_of_joining=new GregorianCalendar(year,month,day);
 full_name=name;
 semester=sem;
 GPA=gpa;
 CGPA=cgpa;
 }
 
 //3.Input of student records
 static void input(Student s[]){
 for(int i=0;i<5;i++){
 System.out.println("Enter the name of student "+(i+1));
 String name=sc.next();
 System.out.println("Enter the dob of student "+(i+1)+" in 
year/month/day format");
 int year=sc.nextInt();
 int month=sc.nextInt();
 int day=sc.nextInt();
 System.out.println("Enter the current semester of student "+
(i+1));
 short sem=sc.nextShort();
 System.out.println("Enter the gpa of student "+(i+1));
 float gpa=sc.nextFloat();
 System.out.println("Enter the cgpa of student "+(i+1));
 float cgpa=sc.nextFloat();
 s[i]=new Student(year,month,day,name,sem,gpa,cgpa);
 }
 }
 
 //2.Overriding the toString() method of java and displaying the 
student records
 public String toString(){
 return ("The name of student: "+full_name+"\nThe dob of 
student: "+
 date_of_joining.get(Calendar.YEAR)+"/"+
 date_of_joining.get(Calendar.MONTH)
+"/"+date_of_joining.get(Calendar.DATE)+
 "\nThe semester of student: "+semester+"\nThe gpa of student: 
"+GPA+
 "\nThe cgpa of student: "+CGPA);
 }
 
 // 4.Sorting the names alphabetically
 static void sort(Student s[]){
 for(int i=0;i<4;i++)
 for(int j=i+1;j<5;j++)
 if(s[i].full_name.compareTo(s[j].full_name)>0){
 Student temp=s[i];
 s[i]=s[j];
 s[j]=temp;
 }
 }
 
 //5. List all the names with a particular substring
 static void substring(Student s[]){
 System.out.println("Enter a substring to find whether it is in the 
names of students");
 String substr=sc.next();
 System.out.println("The names of students with "+substr+" in it 
are ");
 for(int i=0;i<5;i++)
 if(s[i].full_name.contains(substr))
 System.out.println(s[i].full_name);
 }
 }
 
 public class Main
 {
 public static void main(String[] args) {
 Student s[]=new Student[5];
 
 //3.Input of students' data
 Student.input(s);
 
 // 4. Sort the students based on names 
 Student.sort(s);
 
 //3.Display of student records in a sorted fashion
 System.out.println("The data of 5 students is displayed as 
below");
 for(int i=0;i<5;i++){
 System.out.println("The details of student "+(i+1)+" is as 
follows");
 System.out.println(s[i].toString());
 }
 
 //5. Display the names of students with a particular substring
 Student.substring(s);
 }
 