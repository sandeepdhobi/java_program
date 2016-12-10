class error
{
public static void main(String args[])
{
int b=5;
int a=10,c=5;
try
{
int x=a/(b-c);
System.out.println("x="+x);
}
catch(ArithmeticException e)
{
System.out.println("division by zero");
}
int y=a/(b+c);
System.out.println("y="+y);
}
}