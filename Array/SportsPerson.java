class Car
{
	Car()
	{
		System.out.println("car");
	}
	void method1()
	{
		System.out.println("in car");
	}
}
class Desire extends Car
{
	
	Desire()
	{
		System.out.println("desire car");
	}
	void method1()
	{
		System.out.println("in Desire");
	}
}
class Ferrari extends Car
{	
	Ferrari()
	{
		System.out.println("ferrari car");
	}
	void method1()
	{
		System.out.println("in ferrari");
	}
}
class SportsPerson 
{
	public static void main(String[] args) 
	{
		Car[] mycar={new Car(),new Desire(),new Ferrari()};
		mycar[1].method1();
	}

}
