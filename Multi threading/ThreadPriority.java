//getting and setting priority of thread
class CheckPriority extends Thread
{
	public void run()
	{
		System.out.println("I have greater priority");
	}
}
class ThreadPriority extends CheckPriority
{
	public static void main(String[] args) 
	{		
		CheckPriority t=new CheckPriority();
		ThreadPriority t1=new ThreadPriority();
		t1.setPriority(5);
		t.setPriority(10);
		t.start();
		System.out.println("I am main but still assigned lower priority....had hai bhai");
		System.out.println("mai hun bhaiya main aur meri priority hai.."+t1.getPriority()+"mera naam : "+t1.getName());
		System.out.println("i am run, my priority is "+t.getPriority()+"My name : "+t.getName());
	}
}
