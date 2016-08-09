public class Main{

public static void main(String args[])
{
shapeB o1=new Circle();
o1.draw();
o1.draw1();
}
}
interface shapeA{

 public String baseclass="Shape";
  public void draw();
}
interface shapeB extends shapeA{

 public String baseclass="Shape1";
  public void draw1();
}
class Circle implements shapeB
{
public String baseclass="Shape2";
public void draw()
{
System.out.println("shape is drawing...."+baseclass);
}
public void draw1()
{
System.out.println("shape is drawing  1...."+baseclass);
}
}
