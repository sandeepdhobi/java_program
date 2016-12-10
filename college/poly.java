import java.awt.*;
import java.applet.*;
public class poly extends Applet
{
int a[]={20,120,220,20};
int b[]={20,120,20,20};
int n=4;
int c[]={120,220,220,120};
int d[]={120,20,220,120};
int m=4;
public void paint(Graphics g)
{
g.setColor(Color.blue);
g.drawPolygon(c,d,m);
g.setColor(Color.red);
g.fillPolygon(a,b,n);
}}