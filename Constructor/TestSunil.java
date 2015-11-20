class Sunil
{
	Sunil()
	{
		System.out.println("I am in Constructor");
	}
	void Sunil()
	{
		System.out.println("I am in Method");
	}
}
class TestSunil
{
	public static void main(String... args)
	{
		new Sunil().Sunil();
	}
}