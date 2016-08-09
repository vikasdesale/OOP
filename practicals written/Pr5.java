interface Account{
float rate=12;
void set(int accno);
void display();
}
interface Persons{
void store(String n,String a);
void disp();
}

class Customer implements Persons,Account
{
int n,acc,bal;
String name="",addr="";
public void set(int accno)
{
acc=accno;
}
public void display()
{
System.out.println("Account No"+acc);
System.out.println("Balance Rs."+bal);

}
public void disp()
{
System.out.println("Name"+name);
System.out.println("Address"+addr);
}
public void store(String n,String a)
{
name=n;
addr=a;
}
void interest()
{
float inter=(rate*bal*n)/100;
System.out.println("Interest"+inter);
}
Customer(int b,int num)
{
bal=b;
n=num;
}
}
class Pr5{
public static void main(String args[])
{
Customer c1=new Customer(1500,1);
c1.set(1);
c1.store("nidhi","pune");
c1.disp();
c1.display();
c1.interest();
}
}