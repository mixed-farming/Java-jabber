//upper case to lower case using bitwise AND
class bitwise3 { 
public static void main(String[] args) { 
char ch;
for(int i=0; i < 10; i++)
{ ch = (char) ('A' + i); 
System.out.print(ch);
//lowercase = uppercase + 32 
// The below statement turns off the 6th bit. 
ch = (char) ((int) ch | 32); //0000 0000 0010 0000
// ch is now uppercase
System.out.print(ch + " "); 
} 
} }
