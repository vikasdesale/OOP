class const1
{
    int a,b;
    public const()
    {
      a=b=0;
    }
    public const(int m,int n)
    {
      a=m;b=n;
    }
    public const(const c)
    {
      a=c.a;
      b=c.b;
    }
    void display()
    {
      System.out.println("a="+a);
      System.out.println("b="+b);
     }
}
class Obj
{
    public static void main(String arg[])
    {
      const c=new const(2,3);
      System.out.println("Value of first contructor");
      c.display();
     
      const c1=new const(4,5);
      System.out.println("Value of second contructor");
      c1.display();
      
      int p,q;
      p=c.a+c1.a;
      q=c.b+c1.b;

      const c2=new const(p,q);
      System.out.println("Value of third contructor");
      c2.display();
   
      const c3=new const(12);
      System.out.println("Value of last contructor");
      c3.display();
    }
}
