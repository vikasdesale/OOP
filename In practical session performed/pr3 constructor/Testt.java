import java.io.*;
import java.util.*;
class time{
public int hour;
public int second;
public int minute;
time()
{
this(0,0,0);
}
time(int h)
{
this(h,0,0);
}
time(int h,int m)
{
this(h,m,0);
}
time(int h,int m,int s)
{
this.setTime(h,m,s);
}
void setTime(int h,int m,int s)
{
hour=(h>=0&&h<=24)?h:00;
minute=(m>=0&&m<=60)?m:m%60;
second=(s>=0&&s<=60)?s:s%60;
System.out.println(""+String.format("%d%2d%02d%s",hour,minute,second,"AM/PM"));
}
}
class Testt{
public static void main(String args[])
{
time t1=new time(12,56,32);

}
}