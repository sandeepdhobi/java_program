import java.util.*;
class name
{
public static void main(String args[])
{
Vector list=new Vector();
int l=args.length;
int i;
for(i=0;i<l;i++)
{
list.addElement(args[i]);
}
list.insertElementAt("sandeep",2);
int size=list.size();
String listArray[]=new String[size];
list.copyInto(listArray);
System.out.println("list of name");
for(i=0;i<size;i++)
{
System.out.println(listArray[i]);
}
}
}