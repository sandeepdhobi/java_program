import java.util.*;
class sort
{
public static void main(String args[])
{
int i,j,n,s,t;
int large=0;
Scanner in=new Scanner(System.in);
n=in.nextInt();
int a[]=new int[n];
System.out.println("\n");
for(i=0;i<=n-1;i++)
{
a[i]=in.nextInt();
}
for(i=0;i<=n;i++)
{
if(a[i]<a[i+1])
{t=a[i];
a[i]=a[i+1];
a[i+1]=t;
}
}
for(i=0;i<=n-1;i++)
{
a[i]=in.nextInt();
}
System.out.println("sorted array is"+a[i]);
}
}