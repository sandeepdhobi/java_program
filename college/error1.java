class error1
{
public static void main(String args[])
{
int a[]={5,10};
int b=5;
try{
int x=a[2]/b-a[1];
}
catch(ArithmeticException e)
{
System.out.println("division by zero");
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("array index error");
}
catch(ArrayStoreException e)
{
System.out.println("wrong data type");
}
int y=a[1]/a[0];
System.out.println("y="+y);
}
}
