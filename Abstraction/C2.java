abstract class A1 
{
	abstract void display();	
	A1()
	{
		System.out.println("dekhte hain");
	}
}

class C2 extends A1
{
		
	void display()
	{
		System.out.println("C2");
	}

	public static void main(String... args)
	{
		C2 obj=new C2();

	    //A1 obj =new A1();              
	}
}