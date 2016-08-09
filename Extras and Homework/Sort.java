class Sort
{
public static void main(String args[])
{
int a[]={10,20,100,5,4};
int i,temp,j;
for(i=0;i<5;i++)
{
for(j=i;j<5;j++)
{
if(a[i]>a[j])
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
for(i=0;i<5;i++)


{
System.out.println("\n"+a[i]);
}
}
}