public class time
{
private int hour;
private int minute;
private int second;
public void settime(int h,int m,int s)
{
hour=((h>=0 && h<24)? h : 0);
minute=((m>=0 && m<60)? m : 0);
second=((s>=0 && s<60)? s : 0);
}
public static to minitory()
{
return String.format("%02d:%02d:%02d",hour,minute,second);
}
}







class san
{
public static void main(String args[])
{
san s=new san();
System.out.println(s.tominitory());
}
}

