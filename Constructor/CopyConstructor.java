class CopyConstructor 
{
	int x,y;
	CopyConstructor(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
	CopyConstructor(/*CopyConstructor take*/)
	{
		this.y=x;
		this.x=y;
		
	}
	public static void main(String args) 
	{
		new CopyConstructor()=new CopyConstructor(10,20);
		
		//System.out.println(obj1.x+" "+obj1.y);
		                                          
	}
}
