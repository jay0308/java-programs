import java.awt.*;
import java.awt.event.*;
class Mazza implements ActionListener
{
Frame f;
Button b1,b2,b3,b4,b5,b6,b7;
String s1,s2;
TextField tf;
TextArea ta;
   Mazza(String s)
   {
   f=new Frame(s);
   b1=new Button("Jay");
   b2=new Button("Uzma");
   ta=new TextArea("CLick us");
//b3=new Button("3");
//b4=new Button("4");
//b5=new Button("5");
//b6=new Button("6");
//b7=new Button("7");
  tf=new TextField();
  f.setSize(400,400);
  f.setVisible(true);
  f.setLayout(null);
  b1.setBounds(100,120,60,20); 
  b2.setBounds(160,120,60,20);
  ta.setBounds(130,140,80,20);
//b3.setBounds(140,120,20,20);
//b4.setBounds(100,140,20,20);
//b5.setBounds(120,140,20,20);
//b6.setBounds(140,140,20,20);
//b7.setBounds(100,160,20,20);
tf.setBounds(60,50,170,20);
f.add(tf);
f.add(b1);
f.add(b2);
f.add(ta);
//f.add(b3);
//f.add(b4);
//f.add(b5);
//f.add(b6);
//f.add(b7);
b1.addActionListener(this);
b2.addActionListener(this);
//b3.addActionListener(this);
//b4.addActionListener(this);
//b5.addActionListener(this);
//b6.addActionListener(this);
//b7.addActionListener(this);

}
public void actionPerformed(ActionEvent e)
{
    if(e.getSource()==b1)
    {
      s1="Jay";
    }
    if(e.getSource()==b2)
    {
		s2="Uzma";
    tf.setText(s1+(char)03+s2);
    }


}
   public static void main(String sr[])
   {
   Mazza cd=new Mazza("Mazza");
   }
}