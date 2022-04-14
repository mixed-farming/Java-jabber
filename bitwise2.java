//lower case to upper case using bitwise AND
class bitwise2 { 
public static void main(String[] args) { 
char ch;
for(int i=0; i < 10; i++)
{ ch = (char) ('a' + i); 
System.out.print(ch);
//lowercase – uppercase = 32 
// The below statement turns off the 6th bit. 
ch = (char) ((int) ch & 65503); //1111 1111 1101 1111
// ch is now uppercase
System.out.print(ch + " "); 
} 
} }
