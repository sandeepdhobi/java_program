import java.util.*;
class breakcontinue
{
public static void main (String args[])
{
System.out.println("1]break\n2]continue");
Scanner sc =new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
switch(a)
{
case 1:
for(int i=1;i<5;i++)
{
for(int j=0;j<10;j++)
{
if(j>5)
break;
System.out.printf("i="+i+":::j="+j+"\n");
}
}
break;
case 2:
for(int i=1;i<5;i++)
{
for(int j=0;j<10;j++)
{
 if(j>3)
continue;
System.out.println("i="+i+":::j="+j+"\n");
}
}
break;
default:
System.out.println("NON VALID INPUT");
}
}
}

