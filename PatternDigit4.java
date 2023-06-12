import java.util.*;
class PatternDigit4{
static int x=0;
public static void printline(int n){
for(int i=0;x<=n;i++){
pattern(i);
System.out.print("\n");}
}
public static void pattern(int stop){
for(int i=0;i<=stop;i++){
System.out.print(x++);
if(i<stop)System.out.print(",");
}
}
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
printline(n);
}
}
