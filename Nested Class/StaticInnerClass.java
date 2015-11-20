class Outer
{
	Outer()
	{
		System.out.println("Outer constructor");
	}
	private int x=50;
	static class Inner 
	{
		Inner()
		{
			System.out.println("inner constructor");
		}
		void show()
		{
			Outer o1=new Outer();
			System.out.println(o1.x);
		}
	}
}
class StaticInnerClass
{
	public static void main(String[] args) 
	{
		Outer.Inner o=new Outer.Inner();
		o.show();
	}
}
