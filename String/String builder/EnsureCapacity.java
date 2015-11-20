class EnsureCapacity
{
	public static void main(String[] args) 
	{
		StringBuilder sb=new StringBuilder();
		System.out.println(sb.capacity());
		sb.append("Hello");
		sb.ensureCapacity(71);
		System.out.println(sb.capacity());
		sb.append("Java is my favourite language");
		System.out.println(sb.capacity());
		sb.ensureCapacity(80);
		System.out.println(sb.capacity());
	}
}
