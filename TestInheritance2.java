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
class Cat extends Animal{
void Meow()
{
System.out.println("meowing");
}
}
class TestInheritance2{
public static void main(String args[]){
Cat c=new Cat();
c.eat();

c.Meow();
Dog d=new Dog();
d.bark();
d.eat();

}
}