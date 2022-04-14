// Method overriding.
class A {
int i, j;
A(int a, int b) {
i = a;
j = b;
}
// display i and j
void show() {
System.out.println("i and j: " + i + " " + j);
}
}
class B extends A {
int k;
B(int a, int b, int c) {
super(a, b);
k = c;
}
void show() { // display k – this overrides show() in A
System.out.println("overridden : " + k);
}
void show(String msg) { // overload show()
System.out.println(msg + k); //since signature is different
}
}
class Override {
public static void main(String args[]) {
B subOb = new B(1, 2, 3);
subOb.show(); // this calls overridden show() in B
subOb.show("overloaded: "); // this calls overloaded show
}
}