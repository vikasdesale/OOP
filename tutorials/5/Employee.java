import java.io.*;
import java.util.*;
abstract class Emp{
abstract void salary(int id,String name,float Salary);
}
class WedgeEmp extends Emp{
public void salary(int id,String name,float Salary){
System.out.println("Id Of Employee"+id);
System.out.println("Name Of Employee"+name);
System.out.println("The Salary For wedge Employee="+Salary);
}
}
class FixedEmp extends Emp{
public void salary(int id,String name,float Salary){
System.out.println("Id Of Employee"+id);
System.out.println("Name Of Employee"+name);
System.out.println("The Salary For Fixed Employee="+Salary);
}
}
class Employee{
public static void main(String args[])
{
 int ch,period,id;
   String name1;
   float salary;
     Scanner s=new Scanner(System.in);
do{
  System.out.println("----Menu----\n");
  System.out.println("1.Wedge Employee\n2.Fixed Employee");
  System.out.println("Enter Your Choice");
  ch=s.nextInt();
  switch(ch)
  {
   case 1:
         
		  System.out.printf("Enter Emp Id");
		  id=s.nextInt(2);
		   System.out.println("Enter Emp Name");
		  name1=s.nextLine();
		  System.out.println("\nEnter Salary per Period");
		  salary=s.nextFloat();
		  System.out.println("Enter No. of Period");
		  period=s.nextInt();
          salary=period*salary;
          WedgeEmp e=new WedgeEmp();  
          e.salary(id,name1,salary);		  
          break;
   case 2:
           System.out.println("Welcome in Fixed Employee Menu");
          System.out.println("Enter Emp Id");
		  id=s.nextInt();
		  System.out.println("Enter Emp Name");
		  name1=s.nextLine();
		  System.out.println("Enter Salary per Month");
		   salary=s.nextFloat();
          salary=12*salary;
          FixedEmp e1=new FixedEmp();
          e1.salary(id,name1,salary);		
          break;
  
   default:
           System.out.println("Invalid Entry....Try Again");
  }}while(ch!=2);


}
}