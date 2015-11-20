import java.awt.*;
import javax.swing.*;
class MyGridLayout 
{
	JFrame f;
	JButton b1,b2,b3,b4;
	MyGridLayout()
	{
		f=new JFrame();
		b1=new JButton("1");
		b2=new JButton("2");
		b3=new JButton("3");
		b4=new JButton("4");

		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);

		f.setLayout(new GridLayout());

		f.setSize(300,300);
		f.setVisible(true);
	}
	public static void main(String[] args) 
	{
		new MyGridLayout();
	}
}