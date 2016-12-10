import java.util.*;
class primeno
{
public static void main(String args[])
{
Scanner sc =new Scanner(System.in);
System.out.println("enter upto which prime number want\n");
int n=sc.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=2;j<i+1;j++)
{
if((i%j)==0)
{
if(i!=j)
break;
else
System.out.println("PRIME NO IS::::"+j);
}
}
}
}
}