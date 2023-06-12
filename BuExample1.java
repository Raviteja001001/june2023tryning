import java.io.*;
class BuExample1{
public static void main(String args[])throws Exception{
InputStreamReader r=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(r);
System.out.println("enter the name:");
String name=br.readLine();
System.out.println("Welcome to "+name);
}
}