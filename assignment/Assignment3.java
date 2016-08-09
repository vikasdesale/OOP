import java.io.*;
import java.util.*;
class First extends Thread{
public void run()
{
for(int i=1;i<=100;i++)
{
System.out.printf("\ta");
}
System.out.println("\tExit From First");
}
}
class Second extends Thread{
public void run()
{
for(int i=1;i<=100;i++)
{
System.out.printf("\tb");
}
System.out.println("\tExit From second");
}
}
class Third extends Thread{
public void run()
{
for(int i=1;i<=100;i++)
{
System.out.printf("\t"+i);
}
System.out.println("\tExit From Third");
}
}
class Assignment3{
public static void main(String args[])
{

new First().start();
new Second().start();
new Third().start();
}
}