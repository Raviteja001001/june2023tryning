import java .util.Scanner;
class Input2{
public static int sub(int a,int b)
{
int c=a-b;
return c;
}
public static void main(String arg[]){
Scanner scob=new Scanner(System.in);
System.out.println("enter the number");
int a;
a=scob.nextInt();
System.out.println("enter the number");
int b;
b=scob.nextInt();
System.out.println(a+"-"+b+"="+sub(a,b));

}
}

