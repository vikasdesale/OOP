class A{
int a=5;
void show()
{
	System.out.print("a="+a+"\n");
}
}

class B extends A{
int b,a=10;
void show()
{
	super.show();
	b=15;
System.out.print("b="+b+"\n"+"super a="+super.a+"\n"+"a="+a+"\n");
}
}

class demo3
{
public static void main(String args[])
{
	B ob1=new B();
	ob1.show();
	A ob2=new A();
	ob2.show();
}
}