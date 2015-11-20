abstract class Check
{
	 protected abstract void show();
}
abstract class A extends Check
{
	protected abstract void display();
}
class CheckNow extends A
{
	/*protected void show()
	{
		System.out.println("kya protected cha;ta hai");
	}*/
	
	protected void display()
	{
		System.out.println("Dekhten hai");
	}
	public static void main(String... args)
	{
		CheckNow c= new CheckNow();
		c.show();
		c.display();
	}
} 
