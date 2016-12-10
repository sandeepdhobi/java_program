import java.util.*;
class vector
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
String vArray[]=new String[size];
list.copyInto(vArray);
System.out.println("list of name");
for(i=0;i<size;i++)
{
System.out.println(vArray[i]);
}
}
}