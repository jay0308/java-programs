class Parent 
{
	Parent()
	{
		System.out.println("Constructor of Parent");
        }

	static{
		     System.out.println("Static block of Parent");
              }
}

class Child2 extends Parent
{
	Child2()
	{
	        super();		
		System.out.println("Constructor of Child2 ");
        }

	Child2(int x) 
	{
		System.out.println("1-Arg Constructor");
	}

	{        
               System.out.println("Init block of Child2");
	}

	public static void main(String... args)
	{
		new Child2();
        }

}
