interface A1
{
	void display();
	void print();
}

 class B1 implements A1 
{
	void print()
	{
		System.out.println("Print");
	}

    void display()
	{
		System.out.println("Display");
	}
}

class Child4 extends B1 
{
	public static void main(String... args)
	{
		 obj=new Child4();
		obj.display();
		obj.print();
	}

}