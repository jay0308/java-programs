package itispackage;
 public class AccessSpecifier 
{
	protected AccessSpecifier()
	{
		System.out.println("Public specifier");
	}
	public static void main(String[] args) 
	{
		AccessSpecifier a=new AccessSpecifier();
	}
}
