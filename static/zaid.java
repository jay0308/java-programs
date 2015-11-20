class StaticVariable
{
	String name;
	int rollno;
	static String college;
	void data(int m,String n)
	{
		rollno=m;
		name=n;
		
	}

	void display()
	{
		System.out.println(rollno+" "+name+" "+college);
	}
	StaticVariable()
	{
		college="Jamia Millia Islamia";
	}
	public static void main(String[] args)
	{
		StaticVariable obj=new StaticVariable();
		obj.data(111,"uzma");
		obj.display();
		obj.data(222,"Jay");
		obj.display();
	}
}