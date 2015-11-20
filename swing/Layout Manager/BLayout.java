import java.awt.*;
import javax.swing.*;
class BLayout 
{
	JFrame f;
	JButton b1,b2,b3,b4;
	BLayout()
	{
		f=new JFrame();
		b1=new JButton("NORTH");
		b2=new JButton("SOUTH");
		b3=new JButton("EAST");
		b4=new JButton("WEST");

		f.add(b1,BorderLayout.NORTH);
		f.add(b2,BorderLayout.SOUTH);
		f.add(b3,BorderLayout.EAST);
		f.add(b4,BorderLayout.WEST);

		f.setSize(300,300);
		f.setVisible(true);
	}
	public static void main(String[] args) 
	{
		new BLayout();
	}
}