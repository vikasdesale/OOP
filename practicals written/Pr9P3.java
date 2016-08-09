import java.io.*;
class MyExcep extends Exception
{
MyExcep(String msg)
{
super(msg);
}

}
class Pr9P3{
String name;
int age;
public void input()
{
try{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the Name");
name=br.readLine();
System.out.println("Enter Age");
age=Integer.parseInt(br.readLine());
if(age<0)
{
throw new MyExcep("Invalid Age/Age is Negative");

}}catch(Exception e){System.out.println(e.getMessage());}
}
public static void main(String args[])
{
Pr9P3 p=new Pr9P3();
p.input();

}

}