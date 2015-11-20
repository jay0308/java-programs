//defining a thread by implementing Runnable interface
class MyThread implements Runnable
{
	public void run()
	{
		System.out.println("run()");
	}
}
class ThreadDemo6 
{
	public static void main(String[] args) 
	{
		MyThread t=new MyThread();
		Thread t1=new Thread(t);
			t1.start();
	}
}