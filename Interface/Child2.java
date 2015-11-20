abstract class A1 
{
	private int x=20,y=30;
	abstract void show();
}


class Child2 extends A1
{
	void show()
	{
		System.out.println(x+" "+y);
    }

	public static void main(String[] args)
	{
		Child2 obj=new Child2();
		obj.show();
	}
}