class A
{
void eat()
{
System.out.println("Animals eat food");
}
}
class B extends A
{
void bark()
{
System.out.println("Dog barks");
}
}
public class P2
{
public static void main(String args[])
{
B ob1=new B();
ob1.eat();
ob1.bark();
}
}