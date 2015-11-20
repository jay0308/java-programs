class TypePromotion 
{
	void sum(int a,long b)
	{
		System.out.println(a+b);
	}
	void sum(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	public static void main(String[] args) 
	{
		TypePromotion t=new TypePromotion();
		t.sum(20,20);
		t.sum(20,20,20);
	}
}
