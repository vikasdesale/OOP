import java.util.*;
class Fact
{
long fact1(int n)
{
if(n<=1)
  return 1;
  else 
     return(n*fact1(n-1));
}
}
class Factorail
{
public static void main(String args[])
{
Fact f=new Fact();
long a=f.fact1(5);
System.out.println("Factorail is"+a);
}
}