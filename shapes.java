// a simple class hierarchy

//a class for two-dimensional objects
class TwoDShape
{
	double width;
	double height;

	void showDim()
	{
		System.out.println("Width : " + width + "\nHeight : " + height);
	}
}

//subclass Triangle inherits from superclass TwoDShape
class Triangle extends TwoDShape
{
	String style;

	double area()
	{
		return width*height/2;
	}

	void showStyle()
	{
		System.out.println("Triangle is : " + style);
	}
}

class Rectangle extends TwoDShape
{
	String style;

	boolean isSquare()
	{
		if(width==height)
			return true;
		return false;
	}

	double area()
	{
		return height * width;
	}

	void showStyle()
	{
		System.out.println("Triangle is : " + style);
	}
}

class ExtraDim extends TwoDShape
{
	double length;
	String style;
	double volume()
	{
		return height*width*length;
	}

	void showStyle()
	{
		System.out.println("Cuboid is : " + style);
	}

	void showDims()
	{
		System.out.println("Width : " + width + "\nHeight : " + height + "\nLength : " + length);
	}
}

class shapes
{
	public static void main(String[] args) {
		Triangle t1 = new Triangle();
		Triangle t2 = new Triangle();
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();
		ExtraDim c1 = new ExtraDim();

		t1.width=4.0;//inherited from TwoDShape
		t1.height = 4.0;//inherited from TwoDShape
		t1.style = "filled";//from the subclass

		t2.width=8.0;//inherited from TwoDShape
		t2.height = 12.0;//inherited from TwoDShape
		t2.style = "outlined";//from the subclass

		r1.width=5.0;//inherited from TwoDShape
		r1.height = 5.0;//inherited from TwoDShape
		r1.style = "thick";//from the subclass

		r2.width=8.0;//inherited from TwoDShape
		r2.height = 9.0;//inherited from TwoDShape
		r2.style = "dotted";//from the subclass

		c1.width=10.0;//inherited from TwoDShape
		c1.height = 20.0;//inherited from TwoDShape
		c1.length = 30.0;//inherited from subclass
		c1.style = "hollow";//from the subclass

		System.out.println("1st triangle info : ");
		t1.showStyle();
		t1.showDim();
		System.out.println("Area  = " + t1.area());

		System.out.println("\n2nd triangle info : ");
		t2.showStyle();
		t2.showDim();
		System.out.println("Area  = " + t2.area());

		System.out.println("\n1st rectangle info : ");
		r1.showStyle();
		r1.showDim();
		System.out.println("The rectangle is a Square - " + r1.isSquare());
		System.out.println("Area  = " + r1.area());

		System.out.println("\n2nd rectangle info : ");
		r2.showStyle();
		r2.showDim();
		System.out.println("The rectangle is a Square - " + r2.isSquare());
		System.out.println("Area  = " + r2.area());


		System.out.println("\nCuboid info : ");
		c1.showStyle();
		c1.showDims();
		System.out.println("Volume  = " + c1.volume());
	}
}