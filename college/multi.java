import java.util.*;
class multi
{
public static void main(String args[])
{
int i,j,m,n;
Scanner sc=new Scanner(System.in);
m=sc.nextInt();
n=sc.nextInt();
int product[][]=new int[m][n];
for(i=0;i<=m-1;i++)
{
for(j=0;j<=n-1;j++)
{
product[i][j]=2*i;
System.out.print("\t"+product[i][j]);
}
System.out.println("\n");
}
}
} 