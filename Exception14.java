import java.io.*;
import java.util.*;
class A extends Exception{
String msg;
A(String msg){
super(msg);
this.msg=msg;
}
public String toString(){
return msg;
}
}
class Exception14{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int roll=s.nextInt();
String name=s.next();
int marks=s.nextInt();
try{
if(marks<0){
throw new A("not nagative marks..!");
}
else if(marks<40){throw new A("Fail...!");
}
else throw new A("Pass..*");
}
catch(A ex)
{System.out.println(ex);

}
}
}