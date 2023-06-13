import java.io.*;
import java.util.*;
class AgeDoesNotFitException extends Exception{
String msg;
AgeDoesNotFitException(String msg){
super(msg);
this.msg=msg;
}
public String toString(){
return msg;
}
}
class Exception13{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int age=s.nextInt();
try{
if(age<18){
throw new AgeDoesNotFitException("Fail..!");
}
else throw new AgeDoesNotFitException("Pass...*");
}
catch(AgeDoesNotFitException ex)
{System.out.println(ex);

}
}
}