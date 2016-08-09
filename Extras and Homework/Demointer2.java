public class Demointer2{

public static void main(String args[])
{
Itest2 o1=new First();
o1.show();
o1.show2();
}
}
interface Itest
            {
              public void show();
           }
interface Itest2 extends Itest
            {
              public void show2();
           }
class First implements Itest2{
    public void show()
   {
    System.out.println("the method show of Itest Interface");
   }
  public void show2()
   {
    System.out.println("the method show of Itest2 Interface2");
   }
}


