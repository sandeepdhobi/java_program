class sttring
{
public static void main(String args[])
{
StringBuffer str=new StringBuffer("object language");
System.out.println("original string is:"+str);
System.out.println("length of string"+str.length());
for(int i=0;i<str.length();i++)
{
int p=i+1;
System.out.println("character at position"+p+"is"+str.CharAt(i));
}
String stri=new String(str.toString());
int pos=stri.indexOf(" language");
str.insert(process,"oriented");
System.out.println("modified string:"+str);
str.setCharAt(6,'-');
System.out.println("string now:"+str);
str.append("improve security");
System.out.println("append string:"+str);
}
}