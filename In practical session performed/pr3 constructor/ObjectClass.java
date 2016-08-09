    
class box
{
  
private int ht;
private int wd;
private int dp;
public box(int h,int w,int d)
    {
        ht=h;
        wd=w;
        dp=d;  	
    }
public box(int x)
    {
        ht=wd=dp=x;
    }
 
public box()
    {
        ht=wd=dp=0;  
    }
 
    void volume()
    {
        int volume=ht*wd*dp;
        System.out.printf(" Volume is "+volume);  
    }
}
class ObjectClass
{
public static void main(String arg[]) 
{
    box b1=new box(1,2,3);
    box b2=new box();
    box b3=new box(4);
    b1.volume();
    b2.volume();
    b3.volume();
 
} 	

}

