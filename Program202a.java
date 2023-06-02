import java .util.*;
class Program202a{
public static boolean isEven(int n)
{
return((n/2)*2==n);
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n;
System.out.println("enter the number:");
n=sc.nextInt();
if(isEven(n))
System.out.println(n+" even\n");

else

System.out.println(n+"   0dd\n");

}
}