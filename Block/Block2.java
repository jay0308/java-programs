class Block2
{
   int data=5;
      {
         this.display();
	     System.out.println("Init Block");
      }

   Block2()
      {
         this(10);
		 System.out.println("No-Arg Constructor");		 
      }

   Block2(int x)
 	  {
         System.out.println("1 Arg Constructor");
	  }

   void display()
      {
         System.out.println(this.data);
      }

   public static void main(String... args)
      {
	     new Block2();
      }
}      