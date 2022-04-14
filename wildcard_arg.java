class NumFns<T extends Number> {
T num;
NumFns(T n) {
num =n;
}
boolean absEqual (NumFns<?> ob) {
if(Math.abs(num.doubleValue()) == Math.abs(ob.num.doubleValue()))
return true;
return false;
}
}
public class wildcard_arg{
public static void main(String[] args) {
NumFns<Integer> i = new NumFns<Integer> (8);
NumFns<Double> d = new NumFns<Double> (-8.0);
NumFns<Long> l = new NumFns<Long> (6L);
System.out.println("Demonstrating WildCard Arguments : ");
if(i.absEqual(d))
System.out.println("Integer = Double");
else
System.out.println("Integer != Double");
if(i.absEqual(l))
System.out.println("Integer = Long");
else
System.out.println("Integer != Long");
}
}
