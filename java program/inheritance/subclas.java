//use of super keyword
class superclass
{
final void show(final int x)
{
System.out.println("super calss show method "+x);
}
}
class subclas extends superclass
{
void sh(final int x)
{
System.out.println("subclass show method"+x);
}
public static void main(String args[])
{
subclas s=new subclas();
s.show(256);
s.sh(555);
}
}
