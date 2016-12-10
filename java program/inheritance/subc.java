
class superclass
{
void show()
{
System.out.println("this is super methjod");
}
}
class subc extends superclass
{
void shows()
{System.out.println("this is subclass");
}
public static void main(String args[])
{
subc s=new subc();
s.shows();
s.show();
}
}
