import java.util.*;
class PatternDigit2{
public static void printline(int n){
for(int i=1;i<=n;i++){
System.out.print(i+" ");}
}
public static void pattern(int n){
for(int i=1;i<=n;i++){
System.out.println();
printline(i);}
}
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
pattern(n);
}
}
