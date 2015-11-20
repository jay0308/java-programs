class PutInterface
{
    interface InClass
	{
		void display();
	}
}
class MemberInnerInheritance implements PutInterface.InClass  
{
	public void display()
	{
		System.out.println("Displaying method...");
	}

	public static void main(String[] args) 
	{
		PutInterface.InClass m=new MemberInnerInheritance();
		m.display();
	}
}