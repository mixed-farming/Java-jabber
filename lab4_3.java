import java.util.Scanner;
abstract class Figure {
	int dim1, dim2;
	Figure(int x, int y) {
		dim1 = x;
		dim2 = y;
	}
	abstract int area();
}
class Rectangle extends Figure {
	Rectangle(int x, int y) {
		super(x, y);
	}
	int area() {
		return dim1 * dim2;
	}
}
class Triangle extends Figure {
	Triangle(int x, int y) {
		super(x, y);
	}
	int area() {
		return dim1 * dim2 / 2;
	}
}
class Square extends Figure {
	Square(int x) {
		super(x, x);
	}
	int area() {
		return dim1 * dim2;
	}
}
public class lab4_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Figure f;
		System.out.println("Enter the dimensions of rectangle");
		int dim1 = sc.nextInt();
		int dim2 = sc.nextInt();
		Rectangle r = new Rectangle(dim1, dim2);
		f = r;
		System.out.println("The area of the rectangle is " + f.area());
		System.out.println("Enter the base and height of triangle");
		int base = sc.nextInt();
		int height = sc.nextInt();
		Triangle t = new Triangle(base, height);
		f = t;
		System.out.println("The area of the triangle is " + f.area());
		System.out.println("Enter the dimension of square");
		int side = sc.nextInt();
		Square s = new Square(side);
		f = s;
		System.out.println("The area of the square is " + f.area());
	}
}
