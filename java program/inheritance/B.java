//method overriding
class A
{
int i;
void dooverride()
{
System.out.println("value of i in super class"+i);
}
}
class B extends A
{
void dooverride()
{
System.out.println("the value of i is:  "+i);
}
public static void main(String args[])
{
A b=new B();
b.dooverride();
}
}
