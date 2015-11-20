class A1 
{
	A1(int a) 
	{
		System.out.println("Hello World!");
	}
}
class B1 extends A1
{
	
	B1()
	{   
		System.out.println("Cons of B1");
	}
	public static void main(String... agrs)
	{
		new B1();
    }
}
