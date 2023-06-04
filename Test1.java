import java.util.Scanner;
class Test1{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
for(int i=0;i<=+a;i=i+b){
System.out.print(i);
if(i<a){
System.out.print(",");}
}
}
}

