import java.util.*;
class Animal{
public void move(){System.out.println("call frome animal class..");}
}
class Wild extends Animal{
public void move(){System.out.println("call from wild class..");}
}
class Pet extends Animal{
public void move(){System.out.println("call from pet class...");}
}
class PolymorphisamExample3{
public static void main(String args[]){
Animal a=new Animal();
Animal w=new Wild();
Animal p=new Pet();
a.move();
w.move();
p.move();
}
}