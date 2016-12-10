import pac2.classb;
class demo1 extends classb
{
int n=20; 
void display1()
{
System.out.println("n="+n);
System.out.println("n*m="+n*m);
System.out.println("demo1");
}
}
class test2
{
public static void main(String args[])
{
demo1 s=new demo1();
s.display();
s.display1();
}
}