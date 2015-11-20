//Overloading run()
class MyThread extends Thread
{
	public void run()
	{
		System.out.println("run()");
	}
	public void run(int i)
	{
		System.out.println("run(int i)");
	}
}
class ThreadDemo3
{
	public static void main(String[] args) 
	{
		MyThread t=new MyThread();
			t.start();
		

	}
}