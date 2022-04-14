class ByTwos implements Series {
//Implements interface
int start;
int val;
ByTwos() {
start = 0;
val = 0;
}
public void setStart(int x) {
start = x;
val = x;
}
public int getNext() {
val += 2;
return val;
}
public void reset() {
val = start;
}
}

interface Series {
int getNext(); //return next no. in series
void reset(); //restart 
void setStart(int x); //set starting value
}

public class ByTwosSeries {
public static void main(String[] args) {
ByTwos ob = new ByTwos();
System.out.println("Series: ");
System.out.println("Starting at: "+ ob.val);
for(int i = 0; i<5; i++)
System.out.println("Next value: "+ ob.getNext());
System.out.println("Series: ");
ob.reset();
System.out.println("Starting at: "+ ob.val);
for(int i = 0; i<5; i++)
System.out.println("Next value: "+ ob.getNext());
System.out.println("Series: ");
ob.setStart(100);
System.out.println("Starting at: "+ ob.val);
for(int i = 0; i<5; i++)
System.out.println("Next value: "+ ob.getNext());
}
}
