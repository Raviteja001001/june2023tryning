import java.util.*;
class Cons2{
int id;
String name;

Cons2(int i,String n)
{
id=i;
name=n;
}
Cons2()
{


}
void Display(){System.out.println(id+""+name);}
public static void main(String args[]){
Cons2 c1=new Cons2(11,"love");
Cons2 c2=new Cons2();
c2.id=c1.id;
c2.name=c1.name;
c1.Display();
c2.Display();

}
}