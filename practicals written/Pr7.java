import java.lang.*;
import java.io.*;
class Pr7
{
float prin,rate,interest;
int no;
Pr7()
{
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
try{
System.out.println("Enter Principle Amount");
prin=Float.parseFloat(in.readLine());
System.out.println("Enter rate Of Interest");
rate=Float.parseFloat(in.readLine());
System.out.println("Enter No of Years");
no=Integer.parseInt(in.readLine());
}catch(Exception e)
{
}
}
void display()
{
interest=(prin*rate*no)/100;
String s=Float.toString(interest);
System.out.println("The Simple interest is"+s);
}
public static void main(String args[])
{
Pr7 p=new Pr7();
p.display();
}
}