class LocalInner
{
	private int x=1;
	LocalInner()
	{
		System.out.println("Constructor local inner");
	}
	void dostuff()
	{
		class Local extends LocalInner
		{
			int x=5;
			Local()
			{
				//super();
				System.out.println("Constructor ");
			}
			void seeOuter()
			{
				System.out.println("localInner x is "+x);
			}
		}
		Local l=new Local();
		l.seeOuter();
	}
}
class  LocalInnerClass
{
	public static void main(String[] args) 
	{
		LocalInner li=new LocalInner();
		li.dostuff();
	}
}
