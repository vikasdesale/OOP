import java.util.*;
class Emp{
String Name;
String Mail_id;
String Emp_code;
int phone_no;
int i;
public void getData()
{
Scanner s=new Scanner(System.in);
System.out.println("Enter Employee Name:");
Name=s.nextLine();
System.out.println("Enter Employee Email_id");
Mail_id=s.nextLine();
System.out.println("Enter Employee Code");
Emp_code=s.nextLine();
System.out.println("Enter Employee Phone No.");
phone_no=s.nextInt();
}
public void setData(){
System.out.println("........Table Employee........");
System.out.println("\n\t\tName\t\tEmail Id\t\tCode\t\tPhone No.");
System.out.printf("\t\t%s\t%s\t%s\t%d",Name,Mail_id,Emp_code,phone_no);
}
}
class v{

public static void main(String args[])
{
int i;
Emp m();
Emp m[]=new Emp[5];
for(i=0;i<5;i++)
{
m[i].getData();
m[i].setData();
}
}
}