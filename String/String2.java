class String2
{
	public static void main(String[] args) 
	{
		String s=new String();
		String s2=new String();
		s="abcdef";
		s2=s;
		s=s.concat("morestuff");
		System.out.println("s="+s);
		System.out.println("s1="+s2);
	}
}
