class A{
	int a,b;
	A(){
	System.out.println("In class A constructor");
	a=10;
	b=5;
	}
	void msg(){
	System.out.println("Hello");
	System.out.println("value of a:"+a);
	System.out.println("value of b:"+b);
	}
}
class B extends A
{

	B()
        {
	System.out.println("in Class B constructor");
	}
	void msg(){
	
	System.out.println("In class B");
	}
}
class Multilevel extends B
        {


	public static void main(String ar[]) 
        {
	
	A obj=new A();
	obj.msg();
	B obj1=new B();
	obj1.msg();
	}

}

