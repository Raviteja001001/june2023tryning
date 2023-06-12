import java.util.*;
class PatternDigit1{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
for(int i=0;i<=n;i++){
System.out.println();
for(int j=1;j<=i;j=j+1){
System.out.print(j);
}
}
}
}
