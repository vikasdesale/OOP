public class Demointer{

public static void main(String args[])
{
Itest o1=new First();
o1.show();
}
}
interface Itest
            {
              public void show();
           }
class First implements Itest{
    public void show()
   {
    System.out.println("the method show of Itest Interface");
   }
}

