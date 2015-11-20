class Other
{
	public static void main(String[] args)
	{
		System.out.println("Dusre class ka main");
	}
}
class OverloadingMain1
{
	public static void main(int a)
	{
		System.out.println("Overloading main");
	}
	public static void main(String[] args) 
	{
		String s[]={};
				Other.main(s);
		//t.sum(20,20,20);
	}
}
