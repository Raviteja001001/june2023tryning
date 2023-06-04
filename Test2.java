import java.util.Scanner;
class Test2{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
String st="";
for(int i=0;i<=a;i=i+b){
st=st+i+",";


} 
for(int i=0;i<st.length()-1;i++)System.out.print(st.charAt(i));
}
}

