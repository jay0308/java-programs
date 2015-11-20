class Parent 
{
	Parent()
	{
		System.out.println("Parent Constructor");
	}
	
	Parent(int x)
	{
		System.out.println("1-Arg Parent Const");
	}
	{
        System.out.println("Parent Block");
    }
}

class Child4 extends Parent
{
	Child4()
	{
		super(10);
		System.out.println ("Child");
	}
	
	public static void main(String[] args)
	{
		Child4 obj=new Child4();
    }
}
