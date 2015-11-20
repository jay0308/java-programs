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
	int x=20,y=30;
	public void print()
	{
		System.out.println("Hello");
	}

	public void show()
	{
		System.out.println("Welcome");
	}
	Testinterface2()
	{
		System.out.println("Testinterface2");
	}
}

class Testinterface3 extends Testinterface2
{
    int x=2,y=3;
	public void print()
	{
		System.out.println(x);
		System.out.println(y);
    }
	Testinterface3()
	{
		System.out.println("Testinterface3");
	}
    
	public static void main(String[] args)
	{
		Testinterface2 obj=new Testinterface3();
        obj.print();
    }   
}
