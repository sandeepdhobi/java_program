import java.lang.Exception;
class exce extends Exception
{
exce(String message)
{
super(message);
}
}
class testexc
{
public static void main(String args[])
{
int x=5,y=1000;
try
{
float z=(float)x/(float)y;
if(z<0.01)
{
throw new exce("number is too small");
}
}
catch(exce e)
{
System.out.println("caught my exception");
System.out.println(e.getMessage());
}
finally
{
System.out.println("iam always here");
}
}
}