package corejava_package;
interface MyInterface
{
 public void method1 () ;
public void method2 () ;
}
public class demo implements MyInterface
{
public void method1()
{
System.out.println ("implementation of method1");
}
public void method2()
{
System.out.println("implementation of method2");
}


public static void main (String arg[])

{
MyInterface obj=new demo() ;
obj.method1 () ;

}
}
