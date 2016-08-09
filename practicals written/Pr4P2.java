class Addition2{
int a,b,c;
public Addition2()
{
a=10;
b=20;
}
public void add()
{
c=a+b;
}
public void show()
{
System.out.println("Addition is"+c);
}
}
class Subtraction2 extends Addition2{
int x,y,z;
public Subtraction2()
{
x=10;
y=10;

}
public void sub()
{
z=x-y;
}
public void show()
{
super.show();
System.out.println("Subtraction is"+z);
}
}

public class Pr4P2{
public static void main(String args[])
{
Subtraction2 s1=new Subtraction2();
s1.add();
s1.sub();
s1.show();
}
}