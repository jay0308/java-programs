class TypePromotion1 
{
	void Sum(int a,long b)
	{
		System.out.println(a+b);
	}
	void Sum(int a, int b, int c)
	{
		System.out.println(a+b+c);
	}
	public static void main(String[] args) 
	{
		TypePromotion1 t= new TypePromotion1();
		t.Sum(20,20);
		t.Sum(20,20,20);
	}
}
