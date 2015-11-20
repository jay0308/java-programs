class A
{
		final public int Getresult(int a, int b){return 0;}
	
} 
class B extends A
{
	
   public int Getresult(int a, int b){return 1;}
}
class Practice1 
{
	public static void main(String[] args) 
	{
		B b =new B();
		System.out.println("x="+b.Getresult(0,1));
	}
}
