//understing superclass referannce to subclass object
class superclass
{
int instvar=10;
static int classvar=20;
int r=10000;
}
class subclass extends superclass
{
int instvar=253;
static int classvar=56655;
int s=10000000;
public static void main(String args[])
{
int i=5555;
superclass st=new subclass();
System.out.println("super class instance  variable"+st.instvar);
System.out.println("super class static variable "+st.classvar+"and superclass is"+st.r);
System.out.println("value is"+i);
System.out.println("subclass instvar "+st.instvar);
System.out.println("subclass classvar"+st.classvar);
}
}
