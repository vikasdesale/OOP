class sum extends Thread{
public void run()
{
int a=10;
int b=20;
int c;
for(int i=1;i<=20;i++)
{
 c=a+b;
System.out.println("Sum"+c);
a--;
b--;
}
}
class sub extends Thread{
public void run()
{
for(int i=1;i<=20;i++)
c=a-b;
System.out.println("Sub"+c);
a--;
b--;
}
}
}
class Pr10{
public static void main(String args[])
{
Thread p=new sum();
Thread np=new sub();
p.start();
np.start();
}
}
