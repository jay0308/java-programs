interface Printable 
{
	void print();
}

interface Showable extends Printable
{
	void show();
}

class Testinterface2 implements Showable
{
	public void print()
	{
		System.out.println("Hello");
	}

	public void show()
	{
		System.out.println("Welcome");
	}
	
	public static void main(String... args)
	{
	  Testinterface2 obj=new Testinterface2();
	  obj.print();
	  obj.show();
	}
}