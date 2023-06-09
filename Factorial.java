import java.util.*;
class Factorial{
public static int CalculateFact(int n){
if(n==0) return 1;
else return n*CalculateFact(n-1);
}
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int i=s.nextInt();
if(i<0) System.out.println("INVALID");
else System.out.println(CalculateFact(i));
}
}
