interface A2
{
	void display();
}
class B2 implements A2
{
	public void display()
	{
		System.out.println("am in b class");
	}
} 
class C2 extends B2
{
	public void display()
	{
		System.out.println("am in c class");
	}
	public void show()
	{
		System.out.println("HEYYYY");
	}
}
class DownCasting 
{
	public static void main(String[] args) 
	{
		A2 a=(A2)new C2();
		C2 c=(C2)a;
		c.display();
		System.out.println(a);
	}
}
