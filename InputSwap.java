import java .util.Scanner;
class InputSwap{

public static void main(String arg[]){
Scanner scob=new Scanner(System.in);
System.out.println("enter the number");
int a,b;
a=scob.nextInt();
b=scob.nextInt();
a=a+b;
b=a-b;
a=a-b;
System.out.println(a+"\n"+b);

}
}

