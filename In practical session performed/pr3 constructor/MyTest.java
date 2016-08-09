 class MyTest
   {
      int a,b;
       MyTest()
       {
         this(10);
         System.out.println("I  am from default constructor");
         a=1;
         b=2;
         System.out.println("Value of a= "+a);
         System.out.println("Value of b= "+b);
 
       }
       MyTest(int x)
       { 
        this(100,200);
        System.out.println("I  am from Single parameterized constructor");
        a=b=x;
        System.out.println("Value of a= "+a);
         System.out.println("Value of b= "+b);
       }
       MyTest(int a, int b)
       {
          System.out.println("I  am from Single double parameterized constructor");
          this.a=a;
          this.b=b;
          System.out.println("Value of a= "+ this.a);
          System.out.println("Value of b= "+ this.b);
          System.out.println("Value of a= "+a);
         System.out.println("Value of b= "+b);
   
       }
       public static void main(String args[])
       { 
            MyTest t1= new MyTest();
          
       }
            
   }