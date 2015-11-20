//Overriding start()
class MyThread extends Thread
{
	public void run()
	{
		System.out.println("run()");
	}
	public void start()
	{
		System.out.println("start()");
	}
}
class ThreadDemo4
{
	public static void main(String[] args) 
	{
		MyThread t=new MyThread();
			t.start();
		

	}
}