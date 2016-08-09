public class Demointer1{

public static void main(String args[])
{
Itest o1=new First();
o1.show();
Itest2 o2=new First();
o2.show2();
}
}
interface Itest
            {
              public void show();
           }
interface Itest2
            {
              public void show2();
           }
class First implements Itest,Itest2{
    public void show()
   {
    System.out.println("the method show of Itest Interface");
   }
  public void show2()
   {
    System.out.println("the method show of Itest2 Interface2");
   }
}


