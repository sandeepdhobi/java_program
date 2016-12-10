import java.util.*;
import java.io.*;
class flowofcontrol
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("1]if else\n2]switch case\n3]for loop\n4]while loop\n5]do while loop");
int a=sc.nextInt();
switch(a)
{
case 1:
int b=sc.nextInt();
int c=sc.nextInt();
if(b>c)
System.out.println(b+"is greater then"+c);
else
System.out.println(b+"is smaller then"+c);
break;
case 2:
System.out.println("1]+\n2]-\n3]/\n4]*\n5]%");
int z=sc.nextInt();
System.out.println("you entered  "+z);
switch(z)
{
case 10:
int m=sc.nextInt();
int n=sc.nextInt();
System.out.println("sum is "+(m+n));
break;
case 20:
int o=sc.nextInt();
int p=sc.nextInt();
System.out.println("minus is "+(o-p));
break;
case 30:
int q=sc.nextInt();
int r=sc.nextInt();
System.out.println("mult is "+(q*r));
break;
case 40:
int s=sc.nextInt();
int t=sc.nextInt();
System.out.println("division is "+(s/t));
break;
case 50:
int u=sc.nextInt();
int v=sc.nextInt();
System.out.println("remainder is "+(u%v));
break;
default:
System.out.println("invalid input");
}
case 3:
for(int i=0;i>=0;i++)
System.out.println((i*i)+"\n");
break;
case 4:
System.out.println("enter j value");
int j=sc.nextInt();
int k=1;
while(k<=10)
{
System.out.println((j*j*j)+"\n");
j++;
k++;
}
break;
case 5:
int x=sc.nextInt();
double y=(double)(x);
do
{
System.out.println((double)(y/10)+"\n");
y=y/10;
}
while(y>=0.0000001);
break;
default:
System.out.println("wrong input");
}
}
}