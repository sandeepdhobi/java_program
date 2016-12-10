import java.lang.*;
class x extends Thread
{
public void run()
{
for(int i=1;i<=5;i++)
{
if(i==1)
yield();
System.out.println("thred from x i:"+i);
}
System.out.println("exit from x");
}
}
class y extends Thread
{
public void run()
{
for(int j=1;j<=5;j++)
{
if(j==3)
stop();
System.out.println("thred from y i:"+j);
}
System.out.println("exit from y");
}
}
class z extends Thread
{
public void run()
{
for(int k=1;k<=5;k++)
{
if(k==3)
try{
sleep(1000);
}
catch(Exception e)
{
}
System.out.println("thred from z k:"+k);
}
System.out.println("exit from z");
}
}
class ThreadMethods
{
public static void main(String args[])
{
x threadx=new x();
y thready=new y();
z threadz=new z();
}
}