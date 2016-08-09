package p1;
public class test
{
int n;
public test()
{
n=1;
System.out.println("Const"+n);

}
public void show(int n)
{
this.n=n;
for(int i=0;i<n;i++)
{
this.n=n*i;
System.out.println(""+i+"-"+n);
}
}
}