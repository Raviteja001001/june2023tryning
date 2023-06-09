import java.util.*;
class FactorsPrime{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int p=s.nextInt();
int b=0;
for(int i=1;i<=p;i++){
if(p%i==0){
b++;
System.out.print(i);
if(i!=p)System.out.print(",");
}
}
System.out.println(" count factor: "+p+" is: "+b);
if(b==2)System.out.println(" PRIME");
else System.out.println(" NOT PRIME");
}
}

