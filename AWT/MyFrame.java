import java.awt.*;
class MyFrame
{
	Frame f;
	TextField tf;
	Button b;
	MyFrame(String s)
	{
		f=new Frame(s);
		f.setSize(400,400);
		tf=new TextField();
		b=new Button("Click Me");

		tf.setBounds(60,50,170,20);
		b.setBounds(100,120,80,30);

		f.add(tf);
		f.add(b);
		
		f.setLayout(null);
		f.setVisible(true);

	}
	public static void main(String[] args) 
	{
		
		MyFrame f=new MyFrame("My Frame");
	}
}
 