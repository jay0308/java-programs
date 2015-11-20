class TypePromotion2 
{
	void sum(int a)
	{
		System.out.println("ivocking int");
	}
	void sum(short a)
	{
		System.out.println("invocking short");
	}
	public static void main(String[] args) 
	{
		byte b=1;
		TypePromotion2 t=new TypePromotion2();
		t.sum(b);
		//t.sum(20,20,20);
	}
}
