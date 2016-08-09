class A{
int a=5,b=5;
	void f1()
	{
		System.out.print("a="+a+"\n"+"b="+b+"\n");
	}
}
class B extends A{
int c=3,d=3;
	void f2()
	{
		System.out.print("c="+c+"\n"+"d="+d+"\n");
	}
}

class C extends B{
int e=4,f=4;
	void f3()
	{
		System.out.print("e="+e+"\n"+"f="+f+"\n");
	}
}

class demo5{

 public static void main(String args[])
 {	
	A ob3=new A();
	B ob1=new B();
	C ob2=new C();
	ob1.f2();
	ob1.f1();
	ob2.f3();
	ob2.f2();
	ob2.f1();
	ob3.f1();
 }
}