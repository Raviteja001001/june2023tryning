import java .util.Scanner;
class Input3{
public static int div(int a,int b)
{
int c=a/b;
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
System.out.println(a+"/"+b+"="+div(a,b));

}
}

