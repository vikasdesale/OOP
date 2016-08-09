interface Xyz
{
  public void f1();
  
  public void f2();
}
class Inter implements Xyz
{
    public void f1()
    {
     System.out.println("Function 1");  
     
    }
     public void f2()
    {
     System.out.println("Function 2");  
     
    }
    public static void main(String ar[])
    {
      // Xyz x1= null;
      //  Xyz x2= new Xyz(); compilation error..
      
      Inter a1 = new Inter();
      a1.f1();
      a1.f2();
    }
 }