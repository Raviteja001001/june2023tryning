abstract class Bike{
abstract void run();
}
class Ahonda1 extends Bike{
void run(){System.out.println("running safilly..");}
public static void main(String args[]){
Bike b=new Ahonda1();
b.run();
}
}