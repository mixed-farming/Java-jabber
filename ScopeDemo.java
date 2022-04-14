class ScopeDemo
{
public static void main(String a[] )
{ int x=2;// known to all code in main
if( x==2)
{ //starts new scope
int y=3; // y is created and known only 
//to this scope
System.out.println( x+ " " +y); // 2 3
}
//y=7; // error because it got destroyed
x=5; //ok
}
}
