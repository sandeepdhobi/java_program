class A extends Thread
{
public void run()
{
for(int i=1;i<=5;i++)
{
if(i==1)
yield();
System.out.println("thred from A i:"+i);
}
System.out.println("exit from A");
}
}
class B extends Thread
{
public void run()
{
for(int j=1;j<=5;j++)
{
if(j==3)
stop();
System.out.println("thred from B i:"+j);
}
System.out.println("exit from B");
}
}
class C extends Thread
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
System.out.println("thred from C k:"+k);
}
System.out.println("exit from C");
}
}
class Thread
{
public static void main(String args[])
{
new A().start();
new B().start();
new C().start();
}
}