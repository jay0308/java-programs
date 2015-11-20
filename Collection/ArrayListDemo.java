import java.util.*;
class ArrayListDemo 
{
	public static void main(String[] args) 
	{
		ArrayList i=new ArrayList();
		i.add("A");
		i.add(10);
		i.add("A");
		i.add(null);
		System.out.println(i);
		i.remove(2);
		System.out.println(i);
		i.add(2,"m");
		i.add(2,"m");
		System.out.println(i);
	}
}
