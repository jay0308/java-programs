class Static 
{
	static char mycharAt(String s,int i)
	{
     char[] ch=s.toCharArray();
	 return ch[i];
	}
	public static void main(String[] args) 
	{
		String s="uzma";
		char c;
		c=mycharAt(s,3);
		System.out.println(c);
	}
}
