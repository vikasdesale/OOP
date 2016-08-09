import java.util.*;
import java.lang.*;
import java.io.*;
class Fibb 
{
int fib(int n){
              if(n==1)
			      return(1);
			  else if(n==2)
			      return(2);
			  else
			     return(fib(n-1)+fib(n-2));
	}

}
class T3Fib
{
public static void main(String args[])
{
Scanner ss=new Scanner(System.in);
int res;
System.out.println("enter limit of Fibbonacci Series");
int n=ss.nextInt();
Fibb ob=new Fibb();
System.out.println("Series......");
for(int i=1;i<=n;i++)
{
res=ob.fib(i);
System.out.println("\t"+res);
}
//System.out.println("\n the Value of Fibbonacci Series"+res);
}
}