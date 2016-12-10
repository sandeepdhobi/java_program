import java.util.*;
import java.io.*;
class calsi
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("1]+\n2]-\n3]/\n4]*\n5]%");
System.out.println("enter two number:::::\n");
int m=sc.nextInt();
int n=sc.nextInt();
String str=new String();
char z =sc.next().charAt(0);
System.out.println("you entered  "+z+"\n");
switch(z)
{
case '+':
System.out.println("sum is "+(m+n));
break;
case '-':
System.out.println("minus is "+(m-n));
break;
case '*':
System.out.println("mult is "+(m*n));
break;
case '/':
System.out.println("division is "+(m/n));
break;
case '%':
System.out.println("remainder is "+(m%n));
break;
default:
System.out.println("invalid input");
}
}
}