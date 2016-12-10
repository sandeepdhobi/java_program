import java.awt.*;
import java.applet.*;
public class sasa extends Applet
{
public void paint(Graphics s)
{
s.drawLine(100,100,500,500);
s.drawRect(100,200,300,400);
s.fillRect(600,400,300,200);
s.drawRoundRect(100,300,400,500,60,60);
s.fillRoundRect(900,600,500,400,50,72);
}
}
