class Exception1
{

public static void main(String args[])
{
int a[]={5,10};
try{
int b=Integer.parseInt(args[0]);
int x=a[b]/(b-a[1]);
System.out.println("x=="+x);
}catch(ArithmeticException e)
{
System.out.println(e.toString());

}
catch(NumberFormatException e)
{
System.out.println(e.toString());

}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println(e.toString());

}
}
}