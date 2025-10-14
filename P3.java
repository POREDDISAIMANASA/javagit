class T1 extends Thread
{
public void run()
{
try
{
while(true)
{
System.out.println("HIII");
T1.sleep(1000);
}
}
catch(InterruptedException e)
{
System.out.println(e);
}
}
}
class T2 extends Thread
{
public void run()
{
try
{
while(true)
{
System.out.println("Good Morning");
T2.sleep(3000);
}
}
catch(InterruptedException e)
{
System.out.println(e);
}
}
}
public class P3
{
public static void main(String args[])
{
T1 ob1=new T1();
ob1.start();
T2 ob2=new T2();
ob2.start();
}
}





