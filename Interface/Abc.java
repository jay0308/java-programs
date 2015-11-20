interface A1
{
	void display();
	void show();
}

interface B1
{
	void display();
	void show();
}


class Abc implements A1,B1
{
	public Abc()
	{
		System.out.println("Abc");
	}
	
	public void display()
	{
		System.out.println(x);
		System.out.println(y);
	}
    
	public void show()
	{
		System.out.println("show");
	}

	public static void main(String... args)
	{
		Abc obj=new Abc();
		obj.show();
		obj.display();
	}
}