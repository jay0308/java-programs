class A1 
{
  int x=10;	
	A1(int x)
	{
		System.out.println(x);	
	}
      /*  A1()
        {
                System.out.println(x);
        }*/
}

class B1 extends A1
{
	B1()
	{
		super(10);
		System.out.println("B1");
		System.out.println(this);
	}
	void show()
	{
		System.out.println("CHeck it");
	}
	public static void main(String... args)
	{
		//B1 obj1=new B1(12);
		A1 obj= new A1(10);
		//obj.show();
		//System.out.println(obj);
		//System.out.println(obj1);
	}
}