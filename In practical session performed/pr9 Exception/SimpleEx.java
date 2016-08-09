class SimpleEx
{
public static void main(String x[])
{
try
{
int data=25/0;
System.out.println(data);
}
catch(ArithmeticException e)
{
System.out.println(e);
}
System.out.println("the rest of code is:...");
}
}