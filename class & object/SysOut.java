class SysOut
{
	int x,y;
	SysOut()
	{
		System.out.println("Default constructor");
		x=10;
		y=20;
	}
	SysOut(SysOut take)
	{
		this.x=take.x;
		this.y=take.y;
		System.out.println("Copy Constructor... "+"x: "+x+" y: "+y);
	}
	public static void main(String[] args) 
	{
	
			SysOut obj=new SysOut();
			new SysOut(obj);

	}
}
