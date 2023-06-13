import java.io.*;
class Exception10{
public static void main(String args[]){
try{
int a[]=new int[5];
a[5]=3/0;
}
catch(ArithmeticException e){
System.out.println("ArithmeticException occurs:");
}
catch(ArrayIndexOutOfBoundsException e){
System.out.println("ArrayIndexOutOfBoundException occurs:");
}
catch(Exception e){
System.out.println("parant exception occurs");
}
System.out.println("end code.....");
}
}