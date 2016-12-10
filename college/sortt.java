import java.util.*;
class sortt
{
public static void main(String args[])
{
int temp,i,j;
int A[]=new int[50];
Scanner sc=new Scanner(System.in);
System.out.println("enter n");
int n=sc.nextInt();
int l=A.length;
System.out.println("enter array");
for(i=0;i<n;i++)
{
A[i]=sc.nextInt();
}
System.out.println("display array");
for(i=0;i<n;i++)
{
System.out.println(A[i]);
}
for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
if(A[i]<A[j])
{
temp=A[i];
A[i]=A[j];
A[j]=temp;
}
}
}
System.out.println(" sorted Array");
for(i=0;i<n;i++)
{
System.out.println(A[i]);
}
}
}
