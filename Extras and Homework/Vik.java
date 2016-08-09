import java.util.*;
class v{
int a,b;
    v()
{
a=0;
b=0;
}
v(int x,int y)
{
a=x;
b=y;

}
void dispaly()
{
System.out.println("a="+a);
System.out.println("b="+b);
}
v sum(v t)
{
v v1=new v();
v1.a=a+t.a;
v1.b=b+t.b;
return v1;
}

}
class Vik{
public static void main(String args[])
{
int p,q,r,s;
Scanner se=new Scanner(System.in);
System.out.println("Evaluate");
p=se.nextInt();
q=se.nextInt();
r=se.nextInt();
s=se.nextInt();
v v2=new v(p,q);
v v3=new v(r,s);
v v4=new v();
v2.dispaly();
v3.dispaly();
v4=v2.sum(v3);
v4.dispaly();

}
}