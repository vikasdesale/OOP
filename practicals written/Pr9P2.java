import java.lang.*;
class Pr9P2
{
public static void main(String args[])
{
int a=5,c=5,b=5;
int result;
try{
result=a/(b-c);
}catch(Exception e)
{
System.out.println("Divide By Zero");
} 

result=a/(b+c);
System.out.println("result="+result);
}
}