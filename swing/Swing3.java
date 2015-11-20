import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Swing3 implements ActionListener
{
	JFrame f;
	JButton b;
	Button b1;
	JTextField tf;
	Swing3(String s)
	{
		f=new JFrame(s);
		b=new JButton();
		b1=new Button();
		tf=new JTextField();

		b.setBounds(40,40,100,100);
		b1.setBounds(40,150,100,100);
		tf.setBounds(150,40,100,100);
		Container c=f.getContentPane();
		c.add(tf); c.add(b); c.add(b1);
		b.addActionListener(this);
		c.setLayout(null);
		f.setSize(400,500);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		tf.setText("SWING");
	}

	public static void main(String[] args) 
	{
		new Swing3("Swing with content pane");	
	}
}
