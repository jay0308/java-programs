class ExceptionHandling7
{
	public static void main(String[] args) 
	{
		System.out.println("statement1");
		try
		{
			System.out.println("try");
			
		}
		System.out.println("hello");
		catch (Exception e)
		{
			System.out.println(5/0);
		}
		
	}

}
