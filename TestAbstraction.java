abstract class Shape{
abstract void drow();
}
class Rectangle extends Shape{
void drow(){System.out.println("drowing rectangle..");}
}
class Circle extends Shape{
void drow(){System.out.println("drowing circle..");}
}
class TestAbstraction{
public static void main(String args[]){
Shape s=new Circle();
s.drow();
Shape r=new Rectangle();
r.drow();
}
}