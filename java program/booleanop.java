import java.util.*;
class booleanop
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
boolean a=true;
boolean b=false;
System.out.println(a+"|"+b+":"+(a|b));
System.out.println(a+"&"+b+":"+(a&b));
System.out.println(a+"^"+b+":"+(a^b));
System.out.println("logical not"+a+":"+(!a));
System.out.println(a+"||"+b+":"+(a||b));
System.out.println(a+"&&"+b+":"+(a&&b));
System.out.println("shortcut or"+a+"|"+b+"="+(a));
}
}
