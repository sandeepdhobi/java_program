//use of static keyword as it convert into early binding

class shadowing
{
static void display()
{
System.out.println("in static method of supercalass");
}
void insmet()
{
System.out.println("in instance method of super class and not static");
}
}
class test extends shadowing
{
static void display()
{
System.out.println("in static method of subclass");
}
void insmet()
{
System.out.println("in instance method of subclass ");
}

public static void main(String args[])
{
test t=new test();
t.display();//compile time binded as static----binding means make link
t.insmet();//runtime binded therefore overwrite in subclass and show overwrited subclasdisisplay method
shadowing t2=new test();
t2.display();//compile time binded as static
t2.insmet();//compile time binded
}
}



