import java .util.Scanner;
class InputSwap2{

public static void main(String arg[]){
Scanner scob=new Scanner(System.in);
System.out.println("enter the number");
int a,b;
a=scob.nextInt();//2
b=scob.nextInt();//3
a=a+b;//5
b=a-b;//2
a=a-b;//3
System.out.println(a+"\n"+b);

}
}

