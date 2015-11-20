class TypePromotion2
{
	void Sum(int a,long b)
	{
		System.out.println("int version");
	}
	void Sum(long a, long b)
	{
		System.out.println("long version");
	}
	public static void main(String[] args) 
	{
		TypePromotion2 t= new TypePromotion2();
		t.Sum(20,20);
		//t.Sum(20,20,20);
	}
}
