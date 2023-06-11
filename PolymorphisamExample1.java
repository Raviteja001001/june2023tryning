import java.util.*;
class PolymorphisamExample1{
void print(){System.out.println("Welcome");}
void print(String n){System.out.println("Welcome "+n);}
}
class Emp{
public static void main(String args[]){
PolymorphisamExample1 e=new PolymorphisamExample1();
e.print();
Scanner s=new Scanner(System.in);
System.out.println("please enter the your name:");
String st=s.next();
e.print(st);
}
}