import java.util.*;
class ExtractDigit{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
String s1=s.next();
String s2="";
for(int i=0;i<s1.length()-1;i++){
if(s1.charAt(i)>='0' && s1.charAt(i)<='9')
{
//System.out.println(s1.charAt(i));
s2=s2+s1.charAt(i);}
}
System.out.print(s2);
}
}