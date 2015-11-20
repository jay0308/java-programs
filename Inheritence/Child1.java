class Dadaji
{
	Dadaji()
	{
		System.out.println("Constructor of Dadaji");
		System.out.println("REFERENCE : "+this);
	}
}

class Parent extends Dadaji
{
	int x=15;
	Parent() 
	{
		System.out.println("Constructor of Parent");
		System.out.println("REFERENCE : "+(Dadaji)this); 
	}
}

class Child1 extends Parent
{

	Child1()
	{
		System.out.println("Constructor of Child1");
    } 
	
	public static void main(String[] args)
	{
		Child1 obj=new Child1();
		System.out.println("REFERENCE : "+obj);
    }
}
