interface Showable
{
	void show();
	interface Message
	{
		void msg();
	}
}
class NestedInterface implements Showable.Message,Showable 
{

	public void msg()
	{
		System.out.println("Hello nested interface msz");
	}
	public void show()
	{
		System.out.println("Hello nested interface show");
	}
	public static void main(String[] args) 
	{
		Showable.Message m= new NestedInterface();
		m.msg();
		Showable s=new NestedInterface();
		s.show();
	}
}
