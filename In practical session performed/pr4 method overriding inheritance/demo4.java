class A{
	int a=5;
	int b=1;
	A()
	{a=7;}
	
	A(int x,int y)
	{a=x;b=y;}
	
		void show()
	{
		System.out.print("a="+a+"\n");
	}
}

class B extends A{
	int b,a;
	B(){
	super(10,20);
	//a=3;b=4;
	}
	void show()
	{
		//super.show();
		//b=15;
		System.out.print("b="+b+"\n"+"super a="+super.a+"\n"+"a="+a+"\n"+"The B after constructor initialisation is:"+b+"\n");
	}
}

class demo4
{
	public static void main(String args[])
	{
		B ob1=new B();
		ob1.show();
		A ob2=new A();
		ob2.show();
	}
}