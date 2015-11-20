class TypePromotion1 
{
	void sum(int a,long b)
	{
		System.out.println(a+b);
	}
	void sum(long a,int b)
	{
		System.out.println(a+b);
	}
	public static void main(String[] args) 
	{
		TypePromotion1 t=new TypePromotion1();
		t.sum(20,20);
		//t.sum(20,20,20);
	}
}
