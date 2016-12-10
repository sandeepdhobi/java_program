//constructer call   error \u0000 solved by changing notepad 
class constructer_A
{
constructer_A()
{
System.out.println("this is constructer A");
}
}
class constructer_B extends constructer_A
{
constructer_B(int a)
{
System.out.println("this is constructer B"+a);
}
}
class constructerC extends constructer_B
{
constructerC()
{
super(456);
System.out.println("this is constructer C");
}
public static void main(String args[])
{
constructerC c=new constructerC();

}
}

