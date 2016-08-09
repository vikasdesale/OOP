class Example
{
public static void main(String d[])
{
int a=12;
try{
int data=a/0;
System.out.println(data);
System.out.println("this is end..");
}
catch(Exception e)
{
System.out.println(e);
System.out.println("this is end..");
}
finally
{
System.out.println("this is final destination..");
System.out.println("this is end..");

}
System.out.println("code ends...");

}
}