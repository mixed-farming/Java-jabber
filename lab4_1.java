import java.util.*;
class DOB {
int date;
int month;
int year;
}
class Person {
private String name;
private DOB dob = new DOB();
Person(){
name = "";
dob.date = 1;
dob.month = 1;
dob.year = 2001;
}
Person(int dt, int mth, int yr, String Name) {
name = Name;
dob.date = dt;
dob.month = mth;
dob.year = yr;
}
String getName() {
return name;
}
DOB getDOB() {
return dob;
}
}
class CollegeGraduate extends Person {
private int yog;
private float gpa;
CollegeGraduate() {
super();
yog = 0;
gpa = 0;
}
CollegeGraduate(int dt, int mth, int yr, String Name, int YearOG, float GPA) {
super(dt, mth, yr, Name);
yog = YearOG;
gpa = GPA;
}
int getYOG() {
return yog;
}
float getGPA() {
return gpa;
}
void display() {
System.out.println("\nName = " + getName());
DOB dob = getDOB();
System.out.println("DOB = " + dob.date + "/" + dob.month + "/" + dob.year);
System.out.println("GPA = " + getGPA());
System.out.println("Year of graduation = " + getYOG());
}
}
public class lab4_1 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter student details");
int dt, mth, yr, yog;
String Name;
float GPA;
System.out.print("Enter student's name: ");
Name = sc.next();
System.out.println("\nEnter student's Date of birth");
System.out.print("Date : ");
dt = sc.nextInt();
System.out.print("Month : ");
mth = sc.nextInt();
System.out.print("Year : ");
yr = sc.nextInt();
System.out.print("\nEnter student's GPA: ");
GPA = sc.nextFloat();
System.out.print("\nEnter student's year of graduation: ");
yog = sc.nextInt();
CollegeGraduate C = new CollegeGraduate(dt, mth, yr, Name, yog, GPA);
C.display();
}
}
