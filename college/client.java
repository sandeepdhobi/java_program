class client
{
public static void main(String args[])
{
int invalid=0;
int number,count=0;
for(int i=0;i<args.length;i++)
{
try
{
number=Integer.parseInt(args[i]);
}
catch(NumberFormatException e)
{
invalid=invalid+1;
System.out.println("invalid number;"+args[i]);

}
count=count+1;
}
System.out.println("valid number="+count);
System.out.println("invalid number="+invalid);
}
}
