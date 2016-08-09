class A
{

void msg()
{
System.out.println("I am supere class Method");

}
}

class B1 extends A
{


void msg()
{
super.msg();
System.out.println("i am base class");
}
class c extends B1
{


void msg()
{
super.msg();
System.out.println("i am base class");
}


public static void main(String args[])
{

B1 b=new B1();

b.msg();

}
}