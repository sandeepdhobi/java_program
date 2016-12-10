import java.awt.*;
import java.applet.*;
public class cal extends Applet
{
TextField t1,t2;
public void init()
{
t1=new TextField(9);
t2=new TextField(9);
add(t1);
add(t2);
t1.setText("0");
t2.setText("0");
}
public void paint(Graphics g)
{
int x=0,y=0,z=0;
String s1,s2,s;
try
{
s1=t1.getText();
x=Integer.parseInt(s1);
s2=t2.getText();
y=Integer.parseInt(s2);
}
catch(Exception ex){}
z=x+y;
s=String.valueOf(z);
g.drawString("sum=",10,75);
g.drawString(s,100,75);
}
public Boolean Action(Event event,Object object)
{
repaint();
return true;
}
}