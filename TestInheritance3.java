import java.util.*;
class A{
void disp()
{
System.out.println("Method of class  A");
}
}
class B extends A{
void disp()
{
System.out.println("Method of class B");
}
}
class C extends A{
void disp()
{
System.out.println("Method of class C");
}
}
class D extends A{
void disp()
{
System.out.println("Method of class D");
}
}
class TestInheritance3{
public static void main(String args[]){
D D1=new D();
D1.disp();



}
}