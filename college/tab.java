import java.awt.*;
import java.applet.*;
public class tab extends Applet
{
public void paint(Graphics g)
{
int x[]={10,50,80,90,67,32,86,200};
int y[]={60,80,70,123,300,85,400,232};
int n=x.length;
g.drawPolygon(x,y,n);
}
} 