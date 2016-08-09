class fsum extends operation{
float a,b;
double sum;
void sum()
	{
		a=10.1f;b=20.1f;
		sum=a+b;
		System.out.print("a="+a+" b="+b+" sum="+sum+"\n");	
	}
}

abstract class operation
{
abstract void sum();
}
class Isum extends operation
{
int a,b,c=0;
	void sum()
	{
	 a=1;b=2;c=a+b;
	 System.out.print("a="+a+"b="+b+"c="+c+"\n");
	}	
}

class demo6
{
public static void main(String arg[])
	{
	operation ob1;
	ob1=new Isum();
	ob1.sum();
	operation ob2;
	ob2=new fsum();
	ob2.sum();
	}
}
