abstract class operation
{
      abstract void sum1();
      {
      }
      abstract void sum2();
      {
      }
}
class isum extends operation
{
      int a,b,c;
      void sum2()
      void sum1()
      {  
            a=10;
            b=20;
            c=a+b;
            System.out.println("int c="+c);
      }
}

class fsum extends operation
{ 
      double a,b,c;
      void sum2()
      { 
            a=10.0;
            b=10.1;
            c=a+b;
            System.out.println("float c="+c);
      }
}

class Demoi3
{
      public static void main(String ar[])
      {
            operation op1;
            op1=new isum();
            op1.sum1();
            op1.sum2();
            op1=new fsum();
            op1.sum2();
            op1.sum1();
      }
}
   









