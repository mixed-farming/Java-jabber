class VATest {
static void vaMethod(int ... data) {
for(int x : data) System.out.print(x + " ");
}
public static void main(String[] args) {
vaMethod(1); // prints "1 "
vaMethod(1,2,3); // prints "1 2 3 "
}
}
