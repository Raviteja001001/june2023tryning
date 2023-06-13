import java.io.*;
class Exception11{
public static void main(String args[]){
int a[]=new int[4];
a[0]=30;a[1]=301;a[2]=32;a[3]=33;
try{
for(int i=0;i<=5;i++)System.out.println(100/a[i]);
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