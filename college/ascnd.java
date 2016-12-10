import java.util.*;
class ascnd
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
for(i=0;i<=n-1;i++)
{
for(j=i+1;j<=n-1;j++)
{
if(a[i]<a[j])
{
t=a[i];
a[i]=a[j];
a[j]=t;
}
}
}
System.out.println("sorted array is");
for(i=0;i<=n-1;i++)
{
System.out.println(+a[i]);
}
}
}