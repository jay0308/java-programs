class Member1 
{
	//private int x=7;
	class Inner
	{
		void seeOuter()
		{
			''
			int x=3;
			System.out.println("Member x is "+x);
		}
	}
	public void makeInner()
	{
		Inner in=new Inner();
		in.seeOuter();
	}
	public static void main(String[] args) 
	{
		Member1 out=new Member1();
		out.makeInner();
	}
}