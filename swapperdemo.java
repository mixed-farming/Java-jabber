import java.util.*;

class swapper
{

 int x,y;

swapper(int x,int y)
{
this.x=x;
this.y=y;
}

void swap()
{	
int temp = x;
x = y;
y = temp;

}
int getX()
{
	return(x);
}	

int getY()
{
	return(y);
}



}

public class swapperdemo
{
public static void main(String args[])
{

Scanner sc = new Scanner(System.in);

System.out.print("Enter the values of x and y : ");
 int x = sc.nextInt();
int y = sc.nextInt();

swapper s = new swapper(x,y);
s.swap();

System.out.println("\nnew value of x = " + s.getX());
System.out.println("new value of y = " + s.getY());

}
}