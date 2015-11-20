interface Printable { }
class A implements Printable
{
	void a()
	{
		System.out.println("a is a method");
	}
} 
class B implements Printable
{
	void b()
	{
		System.out.println("b is a method");
	}

}
class Call
{
	void invoke(Printable P)
	{
		if(P instanceof A)
		{
			A a= (A)P;
			a.a();
		}
		
		if(P instanceof B)
		{
			B b= (B)P;
			b.b();
		}
	}
}

class Casting
{
	public static void main(String[] args) 
	{
		Printable p=new B();
		Call c=new Call();
		c.invoke(p);
	}
}
