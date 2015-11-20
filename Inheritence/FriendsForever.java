class Friends
{
	static
	{
		System.out.println("FRIENDSHIP");
	}
	public Friends()
	{
		System.out.println("a friend is need is a friend indeed");
		
	}
}
class Uzma extends Friends
{
	void main()
	{
		System.out.println("Between Us She has main ");
		new Jay("CHOR");
	}
	void statement1()
	{
		System.out.println("Uzma: \" jay is my friend \"");
		
	}
	void calling(String name)
	{
		System.out.println("pta hai jab tum mujhe innocently "+name+" kehti hona bht aachha lagta hai");
	}
}
class Jay extends Uzma
{
	int x;
	int Trusty(int x)
	{
		this.x=x;
		return x;
	}
	Jay(){}
	Jay(String name)
	{
		System.out.println("Gotta name: "+name+" hahahahha");
		System.out.println("I have told her "+Trusty(1000)+" times trust me , i care you more than enough");
		calling("BABU");
	}
	void statement2()
	{
		System.out.println("Jay: \"uzma is my friend \"");
	}
}
class FriendsForever
{
	static
	{
		System.out.print("TRUE ");
	}
	public static void main(String[] args) 
	{
		Friends f=new Jay();
		((Jay)f).statement1();
		((Jay)f).statement2();
		((Jay)f).main();

	}
}
