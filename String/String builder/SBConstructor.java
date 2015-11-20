class SBConstructor
{
	public static void main(String[] args) 
	{
		StringBuilder sb=new StringBuilder("chocosholovakiya");
		System.out.println(sb.capacity());
		sb.append("Hello");
		System.out.println(sb.capacity());
		sb.append("Java is my favourite language");
		System.out.println(sb.capacity());
		sb.ensureCapacity(50);
		System.out.println(sb.capacity());
	}
}
