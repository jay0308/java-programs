import java.awt.*;
import java.awt.event.*;
class EventDemo3
{
	Frame f;
	TextField tf;
	EventDemo3(String s)
	{
		f=new Frame();
		tf= new TextField();

		tf.setBounds(60,50,170,20);
		tf.addKeyListener(new KeyEventListener());
		f.addMouseListener(new MouseEventListener(this));
		f.addWindowListener(new WindowEventListener());

		f.add(tf);
		f.setLayout(null);
		f.setSize(400,400);
		f.setVisible(true);
	}

	public static void main(String... args)
	{
		EventDemo3 f=new EventDemo3("Event Demo3");
	}
}  
class WindowEventListener extends WindowAdapter
{
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}
}
class MouseEventListener extends MouseAdapter
{
	EventDemo3 t;
	MouseEventListener(EventDemo3 f)
	{
		this.t=f;
	}
	public void mouseClicked(MouseEvent e)
	{
		t.tf.setText("Mouse Event");
		t.f.setBackground(Color.RED);
	}
}
class KeyEventListener extends KeyAdapter
{
	public void keyTyped(KeyEvent e) 
	{
		System.out.print(e.getKeyChar());
	}
}
