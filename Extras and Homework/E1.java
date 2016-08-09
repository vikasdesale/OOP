class E1
 {
  public static void main(String args[])
 {
  int a=10;
  int b=5;
  int c=5;
  int r;
  try
   { 
     r=a/(b-c);
   }
  catch(ArithmeticException e)
   {
    
    System.out.println("ERROR!!!"+e);
   }
  finally
   { 
    r=a/(c+b);
    System.out.println("Result:"+r);

    }
  }
}