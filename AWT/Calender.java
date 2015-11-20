import java.awt.*;
import java.awt.event.*;
class Calender implements ActionListener
{
Frame f;
Button b1,b2,b3,b4,b5,b6,b7;
TextField tf;
   Calender(String s)
   {
   f=new Frame(s);
   b1=new Button("1");
 b2=new Button("2");
b3=new Button("3");
b4=new Button("4");
b5=new Button("5");
b6=new Button("6");
b7=new Button("7");
tf=new TextField();
f.setSize(400,400);
f.setVisible(true);
f.setLayout(null);
b1.setBounds(100,120,20,20); 
b2.setBounds(120,120,20,20);
b3.setBounds(140,120,20,20);
b4.setBounds(100,140,20,20);
b5.setBounds(120,140,20,20);
b6.setBounds(140,140,20,20);
b7.setBounds(100,160,20,20);
tf.setBounds(60,50,170,20);
f.add(tf);
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
public void actionPerformed(ActionEvent e)
{
    if(e.getSource()==b1)
    {
    tf.setText("Sunday");
    }
    if(e.getSource()==b2)
    {
    tf.setText("Monday");
    }
    if(e.getSource()==b3)
    {
    tf.setText("Tuesday");
    }
    if(e.getSource()==b4)
    {
    tf.setText("Wednesday");
    }
    if(e.getSource()==b5)
    {
    tf.setText("Thursday");
    }
    if(e.getSource()==b6)
    {
    tf.setText("Friday");
    }
    if(e.getSource()==b7)
    {
    tf.setText("Saturday");
    }

}
   public static void main(String sr[])
   {
   Calender cd=new Calender("My Calender");
   }
}