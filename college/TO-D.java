import java.util.*;
class TO-D
{
public static void main(String args[])
{
int i,j,m,n,t;
int A[][]=new int[100][100];
Scanner sc=new Scanner(System.in);
m=sc.nextInt();
n=sc.nextInt();
for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
A[n][m]=sc.nextInt();
if(n==m)
{
if(i==j)
{
if(A[i][j]==A[j][i])
{
System.out.println("transverse matrix");
}
}
}
System.out.println("\t");
}
system.out.println("\n");
}

