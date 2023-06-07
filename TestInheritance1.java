import java.util.*;
class Animal{
void eat()
{
System.out.println("eating");
}
}
class Dog extends Animal{
void bark()
{
System.out.println("barking");
}
}
class BabyDog extends Dog{
void Weep()
{
System.out.println("Weeping");
}
}
class TestInheritance1{
public static void main(String args[]){
BabyDog d=new BabyDog();
d.eat();
d.bark();
d.Weep();

}
}