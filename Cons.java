import java.util.*;
class Cons{
int id;
String name;
int age;
Cons(int i,String n)
{
id=i;
name=n;
}
Cons(int i,String n,int a)
{
id=i;
name=n;
age=a;
}
void Display(){System.out.println(id+""+name+""+age);}
public static void main(String args[]){
Cons c1=new Cons(11,"love");
Cons c2=new Cons(11,"love",22);
c1.Display();
c2.Display();

}
}