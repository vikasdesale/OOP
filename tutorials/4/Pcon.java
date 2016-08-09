import java.io.*;
import java.util.*;
class Persons{

Long  phone_no;
String mail_id;
String emp_code;
String name;
void setData()
{
Scanner s=new Scanner(System.in);
System.out.println("Enter Employee Name:");
name=s.nextLine();
System.out.println("Enter Employee E-mail Id:");
mail_id=s.nextLine();
System.out.println("Enter Employee Code:");
emp_code=s.nextLine();
System.out.println("Enter Employee Phone Number:");
phone_no=s.nextLong(10);
}
void getData()
{
System.out.println("-----------------------------------------------------------------------");
System.out.println("\t\t\tEmployee Information");
System.out.println("-----------------------------------------------------------------------");
System.out.println("\tName\t\tE-mail Id\t\tCode\t\tPhone Number");
System.out.println("\t"+name+"\t"+mail_id+"\t"+emp_code+"\t"+phone_no);
}
}
class Pcon{
public static void main(String args[])
{int i;
Persons p[]=new Persons[5];
for(i=0;i<1;i++)
{
p[i]=new Persons();
}
for(i=0;i<1;i++)
{
p[i].setData();
}
for(i=0;i<1;i++)
{
p[i].getData();
}
}
}


