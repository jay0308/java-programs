class Base
{
	public void print()
	{
	System.out.println("Base");}
}
class Derived extends Base
{
	
	public void print()
	{
	System.out.println("Derived");}
}
public class Main
{
	public static void doprint(Base O)
	{
		O.print();
	}

	public static void main(String[] args) 
	{
	
	    Base x= new Base();
		Base y=new Derived();
		
		Derived d=new Derived();
		doprint(x);
		doprint(y);
		doprint(d);
		
	}
}
