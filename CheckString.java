import java.util.*;
class CheckString{
static boolean isNumber(String s){
for(int i=0;i<s.length();i++){
if(Character.isDigit(s.charAt(i))==false)
{
return false;
}
}
return true;
}
public  static void main(String args[]){
Scanner s=new Scanner(System.in);
String str=s.next();
if(isNumber(str))
System.out.println("Integer");
else
System.out.println("String");
}
}

