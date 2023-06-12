import java.util.*;
class FebonacciSeries1{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n;
int sum=0;
int a=0;
int b=1;
System.out.println("ENTER the value:");
n=s.nextInt();
System.out.print("Fibonacci Series:");
while(sum<=n){
System.out.print(sum+" ");
a=b;
b=sum;
sum=a+b;

}
}
}
