import java.util.*;

class stack<T> 
{
    T[] stk = (T[]) new Object[20];
    static int max = 20;
    int top = -1;
    
    void push(T ele)
    {
        if(top==max-1)
        {
            System.out.println("Stack is full.");
            return;
        }
        stk[++top]=ele;
    }
    
    T pop()
    {
        if (top==-1)
        {
            System.out.println("Stack is empty.");
        }
        return stk[--top];
    }
    
    void display()
    {
        for(int i=top;i>=0;i--)
        {
            System.out.print(stk[i].toString());
        }
        System.out.println();
    }

}

class Student
{
    String first;
    String last;
    String email;
    int section;
    public Student(String first,String last,String email,int section)
    {
        this.first = first;
        this.last =  last;
        this.email = email;
        this.section = section;
    }
    public String toString()
    {
        return section + " " + first + " " + last + " " + email + "\n" ;
    }
}

class Employee
{
    String first;
    String last;
    String email;
    int empid;//employee id
    public Employee(String first,String last,String email,int empid)
    {
        this.first = first;
        this.last =  last;
        this.email = email;
        this.empid = empid;
    }
    public String toString()
    {
        return empid + " " + first + " " + last + " " + email + "\n" ;
    }
}

public class generic_stack
{
    
    public static void main(String args[])
    {
        stack <Student> stu = new stack <Student> ();
        stack <Employee> emp = new stack <Employee> ();
        System.out.println("Student details : ");
        stu.push(new Student("Harish","Dash","hdash2002@gmail.com",1));
        stu.push(new Student("Sharan","Pandey","pandeyji@gmail.com",2));
        stu.push(new Student("Mahima","Poojary","mahi1359@gmail.com",3));
        stu.display();
        stu.pop();
        System.out.println("After first pop : ");
        stu.display();
        System.out.println("Employee details : ");
        emp.push(new Employee("Farhad","Bandhiwala","rockxyz@gmail.com",101));
        emp.push(new Employee("Rakesh","Kumar","rakumar@gmail.com",103));
        emp.push(new Employee("Shreshta","Pai","shreshta1996@gmail.com",105));
        emp.display();
        System.out.println("After two consecutive pops : ");
        emp.pop();
        emp.pop();
        emp.display();
    }
}