import java.awt.*;
import java.awt.event.*;
class MyShedule implements ActionListener
{
Frame f;
Button b1,b2,b3,b4,b5,b6,b7;
TextField tf;
   MyShedule(String s)
   {
   f=new Frame(s);
   b1=new Button("Sunday");
 b2=new Button("Monday");
b3=new Button("Tuesday");
b4=new Button("wednesday");
b5=new Button("Thursdaty");
b6=new Button("Friday");
b7=new Button("Saturday");
//tf=new TextField();
f.setSize(400,400);
f.setVisible(true);
f.setLayout(null);
b1.setBounds(100,120,80,20); 
b2.setBounds(100,140,80,20);
b3.setBounds(100,160,80,20);
b4.setBounds(100,180,80,20);
b5.setBounds(100,200,80,20);
b6.setBounds(100,220,80,20);
b7.setBounds(100,240,80,20);
//tf.setBounds(100,260,80,20);
//f.add(tf);
f.add(b1);
f.add(b2);
f.add(b3);
f.add(b4);
f.add(b5);
f.add(b6);
f.add(b7);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);

}

void newForm( String s)
	{
		f=new Frame(s);
		tf=new TextField();
		tf.setBounds(50,200,300,100);
		f.add(tf);
		f.setLayout(null);
		f.setVisible(true);
		f.setSize(400,400);
		
	}
public void actionPerformed(ActionEvent e)
{
    if(e.getSource()==b1)
    {
    newForm("SUNDAY");
	tf.setText("I wanna do Shopping");
    }
    if(e.getSource()==b2)
    {
		
    newForm("MONDAY");
	tf.setText("I wanna do Shopping");
    }
    if(e.getSource()==b3)
    {
		
    newForm("TUESDAY");
	tf.setText("I wanna do Shopping");
    }
    if(e.getSource()==b4)
    {
		
    newForm("WEDNESDAY");
	tf.setText("I wanna do Shopping");
    }
    if(e.getSource()==b5)
    {
		
    newForm("THURSDAY");
	tf.setText("I wanna do Shopping");
    }
    if(e.getSource()==b6)
    {
		
    newForm("FRIDAY");
	tf.setText("I wanna do Shopping");
    }
    if(e.getSource()==b7)
    {
		
    newForm("SUNDAY");
	tf.setText("I wanna do Shopping");
    }

}
   public static void main(String sr[])
   {
   MyShedule cd=new MyShedule("My Shedule");
   }
}