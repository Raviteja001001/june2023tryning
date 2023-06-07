import java.util.*;
class Cons1{
int id;
String name;

Cons1(int i,String n)
{
id=i;
name=n;
}
Cons1(Cons1 c)
{
id=c.id;
name=c.name;

}
void Display(){System.out.println(id+""+name);}
public static void main(String args[]){
Cons1 c1=new Cons1(11,"love");
Cons1 c2=new Cons1(c1);
c1.Display();
c2.Display();

}
}