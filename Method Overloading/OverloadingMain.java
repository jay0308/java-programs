class OverloadingMain 
{
	public static void main(int a)
	{
		System.out.println("Overloading main");
	}
	public static void main(String[] args) 
	{
		byte b=1;
		TypePromotion2 t=new TypePromotion2();
		main(10);
		//t.sum(20,20,20);
	}
}
