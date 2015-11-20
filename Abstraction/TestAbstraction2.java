abstract class Bike
{
	Bike() 
	{
		System.out.println("Bike is created");
	}
	
	/*Bike(int x)
	{
		System.out.println(x);
	}*/
	{
        System.out.println("Init block");
	}

	abstract void run();
	void changeGear(){
		System.out.println("Gear changed");
	}
}

class Honda extends Bike
{
	void run()
	{
		System.out.println("Running honda");
	}
	
	/*onda()
	{
		super(12);
	}*/
}

class TestAbstraction2
{
	public static void main(String...args)
	{
		Honda obj=new Honda();
		obj.run();
		obj.changeGear();
	}
}