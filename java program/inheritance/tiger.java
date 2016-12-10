//abstract class use

abstract class Animal
{
/*String species;
String name;*/
String n;
Animal(String s,String n)
{
this.n=n;
/*species=s;
name=n;*/
}
void eat(String fooditem)
{
System.out.println("animal name "+n+ "eat"+fooditem);
}
abstract void sound();
}
class tiger extends Animal
{
tiger()
{
super("tiger","asiatictiger");
}
void sound()
{
System.out.println("tiger roar");
}
public static void main(String args[])
{
tiger t=new tiger();
t.eat("mass");
t.sound();
}}


