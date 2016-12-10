import java.util.*;
class TOD
{
public static void main(String args[])
{
int i,j,m,n,t,flag=0;
int A[][]=new int[100][100];
Scanner sc=new Scanner(System.in);
System.out.println("enter row and coloumn");
n=sc.nextInt();
m=sc.nextInt();
for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
A[i][j]=sc.nextInt();
}
}
for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
System.out.print("\t"+A[i][j]);
}
System.out.println(" ");
}
for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
if(n==m)
{
if(A[i][j]!=A[j][i])
{
flag=1;
break;
}
}
}
}
if(flag==0)
System.out.println("transpose");
}
}