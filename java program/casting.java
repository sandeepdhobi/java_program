import java.util.*;
class casting
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("a int,b float,c double,d short ,e byte,char f");
int a=sc.nextInt();
float b=sc.nextFloat();
double c=sc.nextDouble();
short d=sc.nextShort();
byte e=sc.nextByte();
//char f=sc.nextChar();    not for char
a=(int)(8.0/3.0);
System.out.println("float to int:::"+a);
e=(byte)(2555);
System.out.println("short to byte"+e);
d=(short)(255556996);
System.out.println("int to short"+d);
System.out.println("int to char"+(char)85);
byte g;
System.out.println("enter the vlue of byte g");
g=sc.nextByte();
//e=e+g;  give compile error
e+=g;
System.out.println("value of e+g="+e);
}
}
