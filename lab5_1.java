import java.util.Scanner;
interface Series{
 void reset();
 void setStart(int x);
 int getNext();
}
class byTwos implements Series{
 int start=0;
 public void reset(){
 start=0;
 }
 public void setStart(int x){
 start=x;
 }
 public int getNext(){
 start+=2;
 return start;
 }
}
class byFives implements Series{
 int start=0;
 public void reset(){
 start=0;
 }
 public void setStart(int x){
 start=x;
 }
 public int getNext(){
 start+=5;
 return start;
 }
}
public class lab5_1
{
 public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 //illustrating the byTwos class methods
 byTwos t=new byTwos();
 System.out.println("The byTwos series: ");
 for(int i=0;i<3;i++)
 System.out.print(t.getNext()+" ");
 System.out.println();
 t.reset(); //illustrating the reset method
 System.out.println("The byTwos series after reset: ");
 for(int i=0;i<3;i++)
 System.out.print(t.getNext()+" "); //illustrating the getNext method
 System.out.println();
 t.setStart(24); //illustrating the setStart method
 System.out.println("The byTwos series with start set to 24 now: ");
 for(int i=0;i<3;i++)
 System.out.print(t.getNext()+" ");
 System.out.println();
 
 //illustrating the byFives class methods
 byFives f=new byFives();
 System.out.println("The byFives series: ");
 for(int i=0;i<3;i++)
 System.out.print(f.getNext()+" "); //illustrating the getNext method
 System.out.println();
 f.reset(); //illustrating the reset method
 System.out.println("The byFives series after reset: ");
 for(int i=0;i<3;i++)
 System.out.print(f.getNext()+" ");
 System.out.println();
 f.setStart(24); //illustrating the setStart method
 System.out.println("The byFives series with start set to 24 : ");
 for(int i=0;i<3;i++)
 System.out.print(f.getNext()+" ");
 System.out.println();
 }
}
