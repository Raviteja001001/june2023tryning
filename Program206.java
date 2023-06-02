import java .util.*;
public class Program206
{
public static void main(String args[])
{
System.out.println("enter the ASCII values:");
Scanner sc=new Scanner(System.in);
char ch=sc.next().charAt(0);

int ascii =(int) ch;
System.out.println("The ASCII value of " + ch + " is: " + ascii);
}
}
