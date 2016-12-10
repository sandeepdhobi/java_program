import java.awt.*;
import java.applet.*;
public class oval extends Applet
{
public void paint (Graphics g)
{
g.drawOval(2,2,200,300);
g.setColor(Color.green);
g.fillOval(16,16,150,150);
g.fillOval(100,100,150,150);
g.fillOval(16,16,150,150);
g.fillOval(32,32,150,150);
g.setColor(Color.red);
g.fillOval(128,128,300,300);
g.drawArc(200,200,400,400,0,270);
g.setColor(Color.yellow); 
g.fillArc(600,600,250,400,0,90);
}
}