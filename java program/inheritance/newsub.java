//use of super keyword in method
class superclass
{
void show()
{
System.out.println("this is superclass");
}
}
class newsub extends superclass
{
void show()
{
super.show();
}
public static void main(String args[])
{
newsub s=new newsub();
s.show();
}
}
/*s.show---void show() of subclass-----super.show() -------psvm()*/ 