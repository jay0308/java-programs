class Outer  
{
	//private int x=7;
	 void Method1()
	{
		System.out.println("in class Outer");
	}
	class Inner 
	{
		private int x=20;
		private void seeOuter()
		{
			System.out.println("Member x is "+x);
			
		}
		
	}
	class Another 
	{
		Another(){

			Inner inn=new Inner();
			System.out.println(inn.x);
			inn.seeOuter();
		}
	}
	
}
class Member2
{
	
	public static void main(String[] args) 
	{
		Outer out=new Outer();
		Outer.Another in=out.new Another();
		
		
	}
}