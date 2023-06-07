import java.util.*;
class A{
void M(){
System.out.println("this is from M");}

void N(){
System.out.println("this is from N");
this.M();
}
}
class TestThis1{
public static void main(String args[]){
A a=new A();
a.N();




}
}