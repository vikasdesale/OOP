class CDsDVDs extends LibraryManager{
public void printType()
{
System.out.println("This is  CD or DVD");
}
}
class Researchpaper extends LibraryManager{
public void printType()
{
System.out.println("This is  Research Paper");
}
}
class Book extends LibraryManager{
public void printType()
{
System.out.println("This is  Books");
}
}
class Magazines extends LibraryManager{
public void printType()
{
System.out.println("This is  Magazines");
}
}
interface libraryinter{
String getName();
void setName(String name);
int getId();
void setId(int id);
int getPrice();
void setPrice(int price);
void printType();
}
abstract class LibraryManager implements libraryinter
{
String name=null;
int id=0,price=0;
public void  setId(int id)
{
this.id=id;
}
public int getId()
{
return id;
}
public void setName(String name)
{
this.name=name;
}
public String getName()
{
return name;
}
public void  setPrice(int price)
{
this.price=price;
}
public int getPrice()
{
return price;
}
public void printType()
{
}
}

class Research_thesis
{
String refs[];
int c,i;

void addrefu(LibraryManager[] ob)
{
try{
c=ob.length;
for(i=c;i>0;i--)
{
refs[i]=ob[i].getName();
}
}catch(Exception e){
}
}
void  show_ref()
{
try{
for(i=c;i>0;i--)
{
System.out.println(refs[i]);
}
}catch(Exception e){}
}
}
class LibMain
{
public static void main(String args[])
{
Magazines m=new Magazines();
m.setId(1);
m.setName("PC World");
m.setPrice(300);
System.out.println("Id of Magazine is"+m.getId()+"Magazine"+m.getName()+"for"+m.getPrice()+"Added!");
CDsDVDs d=new CDsDVDs();
d.setId(1);
d.setName("Win 7");
d.setPrice(5000);
System.out.println("Id of DVD is"+m.getId()+"DVD"+m.getName()+"for"+m.getPrice()+"Added!");
Book b=new Book();
b.setId(1);
b.setName("Java Programming");
b.setPrice(500);
System.out.println("Id of Book is"+m.getId()+"Book"+m.getName()+"for"+m.getPrice()+"Added!");
Researchpaper r=new Researchpaper();
r.setId(1);
r.setName("Google Glasses");
r.setPrice(300);
System.out.println("Id of Research Paper is"+m.getId()+"Research Paper"+m.getName()+"for"+m.getPrice()+"Added!");

Research_thesis mysearch=new Research_thesis();
LibraryManager list[]={m,d,b,r};
mysearch.addrefu(list);
mysearch.show_ref();
m.printType();
d.printType();
b.printType();
r.printType();
}
}