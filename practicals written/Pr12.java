import java.lang.*;
import java.applet.*;
import java.awt.*;
public class Pr12 extends Applet{
String msg;
public void init()
{
msg=getParameter("String");
if(msg==null)
msg="java";
msg="Hello"+msg;
}
public void paint(Graphics g)
{
g.drawString(msg,100,100);
}
}
/*<applet code="pr12.class" height=200 width=200>
<param  name="String" value="vikas"/>
</applet>*/