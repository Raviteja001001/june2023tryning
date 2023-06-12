import java.util.*;
class PatternDaimand{
public static void printline(char ch1,int nhash,char ch2,int nstar){
for(int i=0;i<=nhash;i++)System.out.print(ch1);
for(int i=0;i<=nstar;i++)System.out.print(ch2);
for(int i=0;i<=nhash;i++)System.out.print(ch1);
}
public static void printUpperpattern(int n,char ch ){
int i,j;
for(i=n/2,j=1;i>0 && j<n;i--,j +=2){
printline('#',i,ch,j);System.out.print("\n");
}
}
public static void printLowerpattern(int n,char ch ){
int i,j;
for(i=0,j=n;i<=n/2 && j>=1;i++,j -=2){
printline('#',i,ch,j);System.out.print("\n");
}
}
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
char ch=s.next().charAt(0);
printUpperpattern(n,ch);
printLowerpattern(n,ch);
}
}
