import p3.sdc;
import p3.sbc;
import p3.sic1;
import p4.odc;
import p4.oic;
public class main{

public static void main(String args[])
{
System.out.println("All Accessible in same package\n");
sbc s=new sbc();
System.out.println(" ...a=10 Private is not Accessible in sdc\n");
sdc x=new sdc();
System.out.println(".....Independent class inside package \n");
sic1 t=new sic1();
System.out.println("......Independent class in No any package a=10 private and c=30 protected and b=20 default is not accessbile outside the package\n");
sic v=new sic();
System.out.println(".....Package p4 ODC extends private and default not accessible......\n");
odc b=new odc();
System.out.println(".....Package p4 oic not extends....\n");
oic k=new oic();
}
}