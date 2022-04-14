import java.util.Scanner; 
class Complex{ 
    int real,imag; //instance variables
    Scanner sc = new Scanner(System.in); 
    void read()//method read
{ 
        real=sc.nextInt(); 
        imag=sc.nextInt(); 
    } 
    void display()//method display
{ 
        System.out.println(real+" +i"+imag); 
    } 
    Complex add(Complex b)//parameterized comstructor add
{ 
        Complex c = new Complex(); 
        c.real=real+b.real; 
        c.imag=imag+b.imag; 
        return c; 
    } 
    Complex subtract(Complex b)//parameterized constructor subtract
{ 
        Complex c = new Complex(); 
        c.real=real-b.real; 
        c.imag=imag-b.imag; 
        return c; 
    } 
} 
 
public class ComplexDemo
{ 
  public static void main (String[] args) 
  { 
    System.out.print("Enter the first complex number "); 
    Complex a = new Complex(); // creating object for class complex
    a.read(); 
    System.out.print("Enter the second complex number "); 
    Complex b = new Complex(); // creating another object for class complex
    b.read(); 
    System.out.print("The first complex number is "); 
    a.display(); 
    System.out.print("The second complex number is "); 
    b.display(); 
    System.out.print("The sum of these 2 complex numbers is "); 
    Complex c=a.add(b); 
    c.display(); 
    System.out.print("The subtraction of these 2 complex numbers is "); 
    c=a.subtract(b); 
    c.display(); 
  } 
} 
