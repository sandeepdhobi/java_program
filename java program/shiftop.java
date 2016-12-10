import java.util.*;
class shiftop{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
System.out.println("left shift"+a+"<<"+b+":"+(a<<b));
System.out.println("right shift"+a+">>"+b+":"+(a>>b));
System.out.println("unsighned right shift:"+a+">>>"+b+":"+(a>>>b));
System.out.println("shift of negative no");
System.out.println("left shift"+(-a)+"<<"+b+":"+(-a<<b));
System.out.println("right shift"+(-a)+">>"+b+":"+(-a>>b));
System.out.println("unsighned right shift:"+(-a)+">>>"+b+":"+(-a>>>b));
}
}
