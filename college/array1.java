import java.util.*;
class array1
{
public static void main(String[] args)
{
int i,j,n;
Scanner in=new Scanner(System.in);
n=in.nextInt();
int a[] =new int[n];
for(i=0;i<=n-1;i++)
{
System.out.print("enter a no");
a[i]=in.nextInt();
}
for(i=0;i<=n-1;i++)
{
System.out.println(a[i]);
}
}
}
