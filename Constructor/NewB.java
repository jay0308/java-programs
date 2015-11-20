class NewA
{
	 private NewA()
	{
		System.out.println("hello");
	}
    static public void method()
	{
		new NewA();
		//System.out.println("pello");
	}
}
class NewB 
{
	NewB()
	{
		System.out.println("world");
	}
	public static void main(String[] args) 
	{
		NewB a=new NewB();
		NewA.method();
	}
}
