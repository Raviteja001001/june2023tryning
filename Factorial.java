import java.util.Scanner;
class Factorial{
void fact(int n)
{
int fact=1;
for(int i=1;i<=n;i++)
{
fact=fact*i;
}
System.out.println("factorial is:"+fact);
}
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("enter the value");
int a=s.nextInt();

new Factorial().fact(a);
}
}
