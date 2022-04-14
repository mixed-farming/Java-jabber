//instance(example) of hierarchy of inheritance
class onedim//superclass
{
	int x=1;
	int getX()
	{
		return x;
	}
}

class twodim extends onedim//inheriting superclass -> subclass
{
	int y=2;
	int getY()
	{
		return y;
	}
}

class threedim extends twodim//inheriting inherited class -> subclass of the subclass 
{
	int z=3;
	int getZ()
	{
		return z;
	}
}

class inheritance
{
	public static void main(String[] args) {
		threedim pt = new threedim();
		System.out.println("Coordinates in 3D are : (" + pt.getX() + "," + pt.getY() + "," + pt.getZ() + ")");
	}
}