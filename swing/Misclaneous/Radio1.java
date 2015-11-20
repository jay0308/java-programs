import javax.swing.*;
import java.awt.event.*;
class Radio1 extends JFrame implements ActionListener 
{
	JRadioButton rb1,rb2;
	JButton b;
	Radio1()
	{
		rb1=new JRadioButton("Male");
		rb2=new JRadioButton("Female");
		rb1.setBounds(100,50,100,30);
		rb2.setBounds(100,100,100,30);
		ButtonGroup bg=new ButtonGroup();
		bg.add(rb1); bg.add(rb2);
		b=new JButton("click");
		b.setBounds(100,150,80,30);
		add(rb1); add(rb2);add(b);
			b.addActionListener(this);
		setSize(300,300);
		setLayout(null);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(rb1.isSelected())
			JOptionPane.showMessageDialog(this,"you are male");
		
		if(rb2.isSelected())
			JOptionPane.showMessageDialog(this,"you are female");
	}

	public static void main(String[] args) 
	{
		new Radio1();	
	}
}
