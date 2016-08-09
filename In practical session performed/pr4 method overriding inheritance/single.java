class A{
	int a,b;
	A(){
	a=10;
	b=5;
	}
	void msg(){
	System.out.println("Hello");
	System.out.println("value of a:"+a);
	System.out.println("value of b:"+b);
	}
}
class Single extends A{
       void msg()
        {
           super.msg();
          System.out.println("Msg method of single class");
        }
	public static void main(String ar[]){
	A obj=new A();
	obj.msg();
	}
}