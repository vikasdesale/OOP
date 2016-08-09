class Test
{
public static void main(String args[])
{
Test t1=new Test();
}
	int a,b,c;
Test()
{
this(10);
System.out.println("from default constructor");
a=1;
b=2;
System.out.println("value of a="+a);
System.out.println("value of b="+b);
}
Test(int y)
{
this(100,200,300);
System.out.println("from single parametrised con");
a=b=y;
System.out.println("value of a is="+a);
System.out.println("value of b="+b);
}
Test(int a,int b,int c)
{
System.out.println(" from double parametrised constructor");
this.a=a;
this.b=b;
System.out.println("value of a="+this.a);
System.out.println("valu of b="+this.b);
System.out.println("value of b="+b);
System.out.println("value of a="+a);
System.out.println("valu of c"+c);
}
}