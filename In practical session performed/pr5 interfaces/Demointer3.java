public class Demointer3{

public static void main(String args[])
{
System.out.println("\n*****Calling By Using c1 Class object***\n");
C1 b=new C1();
b.f1();
b.f2();
b.f3();
b.f4();
b.f5();
b.f6();
A2 b1=new C1();
System.out.println("\n*****Calling By Using Abstact Class Reference***\n");
b1.f1();
b1.f2();
b1.f3();
b1.f4();
b1.f5();
}
}
interface Itest
            {
              public void f1();
           }
interface Itest2 extends Itest
            {
              public void f2();
           }
abstract class A1{

abstract void f3();
}
abstract class A2 extends A1 implements Itest,Itest2
{

  public void f1()
   {
    System.out.println("the method f1 of Itest Interface ");
   }
 public void f3()
   {
    System.out.println("the method f3 Method of Abstract ");
   }
public void f4()
   {
    System.out.println("Concreate Method f4 ");
   }
abstract void f5();
}
class C1 extends A2{
   public void f2()
   {
    System.out.println("the method f2 of Itest2 Interface ");
   }
 public void f3()
   {
    System.out.println("the method f3 Method of Abstract class A1");
   }
public void f5()
   {
    System.out.println("the method f5 Method of Abstract class A2 ");
   }
public void f6()
   {
    System.out.println("Concreate Method f6 ");
   }
}


