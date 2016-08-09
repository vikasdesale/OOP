import java.util.*;
import java.io.*;
class V
{
int power(int base,int exp)
{
if(exp<=1)
  return base;
  else 
     return(base*power(base,exp-1));
}
}
class MExp
{
public static void main(String args[])
{
int base,exp,c;
Scanner ss=new Scanner(System.in);
System.out.println("enter Base No");
base=ss.nextInt();
System.out.println("enter Power No");
exp=ss.nextInt();
V v=new V();
c=v.power(base,exp);
System.out.println("Result"+c);
}
}