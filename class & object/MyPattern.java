class MyPattern 
{
	MyPattern()
	{
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<15;j++)
			{
				if((i==0&&j%3==0)||j<3)
					System.out.print("*");
				else if(i==0)
					System.out.print(" ");
			

			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		new MyPattern();
	}
}
