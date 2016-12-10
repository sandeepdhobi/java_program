import java.awt.*;
import java.applet.*;
public class magic extends Applet
{
public void paint(Graphics g)
{
g.drawString("APPLET",100,100);
for(int i=0;i<=6;i++)
{

for(int j=0;j<=10;j++)
{
if((i+j)%2==0)
{
g.setColor(Color.blue);
g.drawOval(50*j,i*50,50,50);
}
else
{
g.setColor(Color.red);
g.fillOval(50*j,i*50,50,50);

}
System.out.print("      ");
}
System.out.print("      ");
}
}
}