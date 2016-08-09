public class Dem2{

public static void main(String args[])
{

Itest2 o2=new First();
o2.show2();
First f=new First();
f.s1();
f.s2();
}
}
abstract class Itest
            {
             public void show2()
{
 System.out.println("Abstract class itest Method show2");
}
             abstract void s1();
           }
abstract class Itest2 extends Itest
            { 
           public void show2()
          { 
            super.show2();
            System.out.println("Abstract class itest2 Method show2");
   }

             abstract void s2();
           }
class First extends Itest2{
    public void s1()
   {
    System.out.println("Abstract method s1 of class Itest");
   }
  public void s2()
   {
    System.out.println("Abstract method s2 of class Itest2");
   }
}


