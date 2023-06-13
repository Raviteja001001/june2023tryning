import java.io.*;
class Exception12{
public static void main(String args[]){
try{
int a[]=new int[4];
a[4]=3/0;
}

catch(ArithmeticException e)
{System.out.println("task1 is compleated:");}
catch(ArrayIndexOutOfBoundsException e)
{System.out.println("task2 is compleated:");}
catch(Exception e)
{System.out.println("common task compleated..");}
System.out.println("end code.....");
}
}