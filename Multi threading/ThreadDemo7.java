/* Tausif sir's approach to define a thread
	(not recommended to use)*/
class MyThread extends Thread
{
	public void run()
	{
		System.out.println("run()");
	}
}
class ThreadDemo7 
{
	public static void main(String[] args) 
	{
		MyThread t=new MyThread();
		Thread t1=new Thread(t);
			t1.start();
			System.out.println("main()");
	}
}