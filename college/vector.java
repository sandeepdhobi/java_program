import java.util.*;
class vector
{
public static void main(String args[])
{
string str;
Scanner san=new Scanner(System.in);
Vector v=new Vector();
int i,choice=0;
System.out.println("enter 5 student");
for(i=0;i<=4;i++)
{
str=san.next();
v.addElement(str);
}
while(choice!=4)
{
System.out.println("1.addelement\n2.deletelement\n3.display name");
choice=san.next.Int();
switch(choice)
{
case 1:System.out.println("enter name");
str=san.next();
v.addElement(str);
break;
case 2:System.out.println("enter name");
str=san.next();
v.removeElement(str);
break;
case 3:System.out.println("enter name");
i=san.nextInt();
System.out.println("name:"+v.elementAt(i));
break;
case 4:break;
default:
System.out.println("inva0lid choice");
}
}
System.out.println("current list");
for(i=0;i<=4;i++)
{
System.out.println(v.elementAt(i));
}
}
}