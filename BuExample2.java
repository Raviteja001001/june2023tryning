import java.io.*;
class BuExample2{
public static void main(String args[])throws Exception{
InputStreamReader r=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(r);
String name="";
while(!name.equals("stop")){
System.out.println("enter the data:");
name=br.readLine();
System.out.println("data is "+name);
}
br.close();
r.close();
}
}