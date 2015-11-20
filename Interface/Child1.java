//Adapter Class
interface A1
{
	void display();
	void show();
	void print();
}  

class Abc implements A1
{
	public void display(){	}
	
	public void show()   {  }

	public void print()  {  }
	
}

class Child1 extends Abc
{
   public void display()
	{
		System.out.println("display");
    }

	public static void main(String... args)
	{
		Child1 obj=new Child1();
		obj.display();
	}
}
