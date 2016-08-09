class A{
int a=5;
void show()
{
	//a=5;
	System.out.print("a="+a);
}
}

class B extends A{
int b,a=10;
void disp()
{
	b=15;
System.out.print("b="+b+"super a="+super.a+"a="+a);
}
}

class demo2
{
public static void main(String args[])
{
	B ob1=new B();
	ob1.disp();
	A ob2=new A();
	ob2.show();
}
}