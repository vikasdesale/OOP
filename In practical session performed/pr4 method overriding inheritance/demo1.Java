class A{
int a;
void show()
{
	a=5;
	System.out.print("a="+a);
}
}

class B extends A{
int b;
void disp()
{
	b=15;
System.out.print("b="+b);
}
}

class demo1
{
public static void main(String args[])
{
	B ob1=new B();
	ob1.show();
	A ob2=new A();
	ob2.show();
}
}