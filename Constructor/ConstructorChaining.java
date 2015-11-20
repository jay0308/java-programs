class ConstructorChaining 
{
	int x=10;
	ConstructorChaining()
	{
		this(this);
		System.out.println("Dekha Bhaiyaa");
	}
	
	ConstructorChaining(ConstructorChaining obj)
	{
		this.x=x;
		System.out.println(this.x);
	}
	public static void main(String[] args) 
	{
		new ConstructorChaining();
		System.out.println("Hello World!");
	}
}
