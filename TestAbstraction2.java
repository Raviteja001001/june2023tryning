abstract class Bike{
Bike(){System.out.println("bike is created");}
abstract void run();
void Gear(){System.out.println("gear is chenged");}
}
class Honda extends Bike{
void run(){System.out.println("running safilly..");}
}
class TestAbstraction2{
public static void main(String args[]){
Bike b=new Honda();
b.run();
b.Gear();
}
}