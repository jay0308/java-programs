class TypePromotion3
{
	void Sum(int a,float b)
	{
		System.out.println("first method is invocked");
	}
	void Sum(float a, int b)
	{
		System.out.println("second method is invocked");
	}
	public static void main(String[] args) 
	{
		TypePromotion3 t= new TypePromotion3();
		t.Sum(20.392,2046362656);
		//t.Sum(20,20,20);
	}
}
