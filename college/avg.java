import java.util.*;
class avg
{
public static void main(String args[])
{
int i,n,s;
float avg;
int sum=0;
Scanner in=new Scanner(System.in);
n=in.nextInt();
System.out.println("\n");
for(i=1;i<=n;i++)
{
s=in.nextInt();
sum=s+sum;
}
avg=(float)sum/n;
System.out.println("avg is="+avg);
}
}