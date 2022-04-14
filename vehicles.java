class Vehicle 
{
int passengers, fuelCap, mpg;
void range()
{
System.out.println("range: " + fuelCap * mpg);
}
double fuelNeeded(int distance) {
return (double) distance / mpg;
}
}


class vehicles
{
public static void main(String[] args) 
{
Vehicle van = new Vehicle();
Vehicle car = new Vehicle();
car.passengers = 4;
car.mpg = 25;
car.fuelCap = 12;
van.passengers = 6;
van.mpg = 35;
van.fuelCap = 18;

car=van;
car.mpg=69;

car.range();
System.out.println(car.mpg);
System.out.println(van.mpg);
System.out.println(car.fuelNeeded(750));
}
}

