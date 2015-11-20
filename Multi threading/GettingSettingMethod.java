//getting and setting name of thread
class GettingSettingMethod 
{
	public static void main(String[] args) 
	{
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("jay");
		System.out.println(Thread.currentThread().getName());
	}
}
