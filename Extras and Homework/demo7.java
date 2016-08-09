abstract class A
{
abstract void f1();
abstract void f2();
}

abstract class B extends A
{
void f1()
{
System.out.print("f1 in B\n");
}
void f3()
{
System.out.print("f3 in B\n");
}
abstract void f4(); 
}

class C extends B
{
void f2()
{
System.out.print("f2 in C\n");
}
void f4()
{
System.out.print("f4 in C\n");
}
void f1()
{
System.out.print("f1 in C\n");
}
void f5()
{
System.out.print("f5 in C\n");
}
}

class demo7
{
public static void main(String arg[])
{
A ob1;
ob1=new C();
B ob2;
ob2=new C();
C ob3=new C();
System.out.print("The following methods are accessed by object of A:\n"); 
ob1.f1();
ob1.f2();
 System.out.print("The following methods are accessed by object of B:\n");
ob2.f1();
ob2.f3();
ob2.f4();
System.out.print("The following methods are accessed by object of C:");
ob3.f1();
ob3.f2();
ob3.f3();
ob3.f4();
ob3.f5();
}
}