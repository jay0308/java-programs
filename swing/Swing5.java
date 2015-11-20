import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Swing5 implements ActionListener
{
	JFrame f;
	JButton b;
	Button b1;
	JTextField tf;
	Swing5(String s)
	{
		f=new JFrame(s);
		b=new JButton();
		b1=new Button();
		tf=new JTextField();

		b.setBounds(40,40,100,100);
		b1.setBounds(40,150,100,100);
		tf.setBounds(150,40,100,100);
		
		f.add(tf); f.add(b); f.add(b1);
		b.addActionListener(this);
		b1.addActionListener(this);
		WindowUtilities.setMotifLookAndFeel();
		f.setLayout(null);
		f.setSize(400,500);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b)
		tf.setText("SWING");
		else
			tf.setText("AWT");
	}

	public static void main(String[] args) 
	{
		new Swing5("Swing without content pane");	
	}
}
