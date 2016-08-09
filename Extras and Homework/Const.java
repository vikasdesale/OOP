class Const
{
static int a,b;
Const()
{this(30);
int a,b;
a=10;
b=20;

System.out.println("I am default constructor");
System.out.println("value of a="+a);
System.out.println("value of b="+b);
}
Const(int x)
{
this(50,40);
a=b=x;
System.out.println("I am parameterized constructor with only one argument");
System.out.println("value of a="+a);
System.out.println("value of b="+b);

}
Const(int a,int b)
{0

this.a=a;
this.b=b;
System.out.println("I am parameterized constructor with argument of two");
System.out.println("value of a="+a);
System.out.println("value of b="+b);

}
public static void main(String args[])
{
Const c=new Const();
}
}