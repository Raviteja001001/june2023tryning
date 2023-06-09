import java.util.*;
class pattern{
public static void printline(char c,int a){
System.out.println();
for(int i=1;i<=a,i++){
System.out.print(c);
}
}
public static void printstar(char c,int n){
for(int j=i;j>=0;j--){
printline(c,j);
}
}
}
class Pattern1{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
char ch=s.next().charAt(0);
int b=s.nextInt();
printstar(ch,b);
}
}
