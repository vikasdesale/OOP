interface Xyz
{
public void fn1();
public void fn2();
}
class Interf implements Xyz
{
public void fn1()
{
System.out.println(1);
}
public void fn2()
{
System.out.println(2);
}
public static void main(String args[])
{
Interf a=new Interf();
a.fn1();
a.fn2();
}
}
