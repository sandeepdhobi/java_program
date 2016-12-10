//use of super keyword------accessing method of superclass
class superclass
{
void show
{
System.out.println("this is super methjod");
}
class subc extends superclass
{
public static void main(String args[])
{
subc s=new subc();
s.show();
}
}
