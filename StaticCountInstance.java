class myclass
{
	static int count=0;
	myclass()
	{
		count++;
	}
}

public class StaticCountInstance
{
	public static void main(String[] args) {
		for(int i=0;i<5;i++)
		{
			myclass ob = new myclass();
			System.out.println("Object number : " + myclass.count);//can be done using ob.count also
		}
	}
}