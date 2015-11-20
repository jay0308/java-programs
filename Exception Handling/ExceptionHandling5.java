class ExceptionHandling5
{
	public static void main(String[] args) 
	{
		System.out.println("statement1");
		try
		{
			System.out.println("try");
			System.out.println(10/0);
		}
		catch (Exception e)
		{
			System.out.println(5/0);
		}
		finally
		{
			System.out.println("final");
		}
	}

}
