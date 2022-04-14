import java.util.Scanner;
interface Sports{
 void putGrade();
}
class Student {
 int rno,marks;
 char grade;
 Scanner sc=new Scanner(System.in);
 Student(char a){
 grade=a;
 }
 void getNumber(){
 System.out.println("Enter the roll no of student : ");
 rno=sc.nextInt();
 }
 void putNumber(){
 System.out.println("This student's roll no is "+rno);
 }
 void getMarks(){
 System.out.println("Enter the marks of student : ");
 marks=sc.nextInt();
 }
 void putMarks(){
 System.out.println("This student's marks is "+marks);
 }
}
class result extends Student implements Sports{
 char result;
 result(char ch){
 super(ch);
 }
 public void putGrade(){
 System.out.println("The student's grade in sports is "+grade);
 }
 //if a student scores F(fail) in sports, then he has failed, else he has passed with the grades 
 //determined on the basis of marks.
 void showResult(){
 if(grade=='F')
 result='F';
 else if(marks>=90)
 result='A';
 else if(marks>=80)
 result='B';
 else if(marks>=70)
 result='C';
 else if(marks>=60)
 result='D';
 else if(marks>=40)
 result='E';
 else result='F';
 if(result=='F')
 System.out.println("The student has failed");
 else 
 System.out.println("The student's final result is "+result);
 }
}
public class lab5_3
{
public static void main(String[] args) {
result r=new result('F');
r.getNumber();
r.getMarks();
r.putNumber();
r.putMarks();
r.putGrade();
r.showResult();
}
}