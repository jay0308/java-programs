public class Constructor
{
    Constructor(int a)
	{
		System.out.println("Constructor invocked");
	}
	public static void main(String[] args)
	{
		Constructor c =new Constructor(5);
	}
}