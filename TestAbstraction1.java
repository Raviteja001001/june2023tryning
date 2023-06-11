abstract class Bank{
abstract int Intrest();
}
class SBI extends Bank{
int Intrest(){return 7;}
}
class PNB extends Bank{
int Intrest(){return 8;}
}
class TestAbstraction1{
public static void main(String args[]){
Bank b;
b=new SBI();
System.out.println("rate of intrest is:"+b.Intrest()+"%");
b=new PNB();
System.out.println("rate of intrest is:"+b.Intrest()+"%");
}
}