interface Check
{
	    Check c=new Check(){
	
		public void method1()
			{
				System.out.println("overriding...");
			}
	};
	class Abc
	{
		void method()
		{
			System.out.println("i am in interface nested class");
		}
	}
	 void method1();
}
class Mno implements Check
{
	public void method1()
	{
		System.out.println("Method of interface");
	}
	public static void main(String... args)
	{
		Mno s=new Mno();
		Mno.Abc a=new Mno.Abc();
		a.method();
		s.method1();c.method1();
	}
}