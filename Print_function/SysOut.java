class S
{
  static Demo o;
 static  {
             System.out.println("adeeb"); //o=new Demo();
          }

}

class Demo
{
   void p(int x)
   {
      System.out.println(x);
   }
}


class SysOut
{
     public static void main(String[] args)
	 {
           S a=new S();
	  // S.o.p(10);
	 }  
}   
	