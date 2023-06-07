import java.util.*;
class PalinString1{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
String s1=s.next();
s1=s1.toLowerCase();
String temp="";
int ascii;
for(int i=s1.length()-1;i>=0;i--){
if(s1.charAt(i)<='A'&& s1.charAt(i)>='Z'){
ascii=s1.charAt(i);
ascii=ascii+32;
temp=temp+(char)ascii;
}
else
temp=temp+s1.charAt(i);
}
System.out.println("temp:"+temp);
s1=temp;
String s2="";
for(int i=s1.length()-1;i>=0;i--){s2=s2+s1.charAt(i);}
if(s1.equals(s2)){

System.out.println("YES");
}
else
{
System.out.println("NO");
}
}
}