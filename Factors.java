import java.util.*;
class Factors{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int p=s.nextInt();
int b=0;
for(int i=1;i<=p;i++){
if(p%i==0){
b++;
System.out.print(i);
if(i!=p)System.out.print(",");}
}
System.out.println("count factor: "+p+" is: "+b);
}
}

