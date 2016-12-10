public class wrapper
{
public static void main(String args[])
{
Integer i=new Integer("30");
Integer i2=new Integer(25);
int i4=i.intValue();
String ivalue=i.toString();
Integer i3=Integer.valueOf("45");
int x=Integer.parseInt("100");
System.out.println("i4 :"+i4+"\nivalue"+ivalue+"\ni3"+i3.toString()+"\nx:"+x);
}
}