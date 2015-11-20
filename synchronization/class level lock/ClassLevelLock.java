class Test
{
	synchronized public static void get()
	{
		System.out.println(Thread.currentThread().getName()+" lets do");
		try{Thread.sleep(1000);}
		catch(InterruptedException e){}
		System.out.println(Thread.currentThread().getName()+" something");
		try{Thread.sleep(1000);}
		catch(InterruptedException e){}
		System.out.println(Thread.currentThread().getName()+" no one is there ");
		try{Thread.sleep(1000);}
		catch(InterruptedException e){}
		System.out.println(Thread.currentThread().getName()+" to think about u");

	} 
}
class MyThread extends Thread
{
	Test t;
	MyThread(Test t)
	{
		this.t=t;
	}
	public void run()
	{
		t.get();
	}
}
class ClassLevelLock 
{
	public static void main(String[] args) 
	{
		Test t=new Test();
		MyThread t1=new MyThread(t);
		MyThread t2=new MyThread(t);
		t1.start();
		t2.start();

	}
}