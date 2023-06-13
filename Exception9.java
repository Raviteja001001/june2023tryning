import java.io.*;
class Exception9{
public static void main(String args[]){
PrintWriter pw;
try{
pw=new PrintWriter("jtp.txt");
pw.println("saved");
}
catch(FileNotFoundException e){
System.out.println(e);
}
System.out.println("file saved successfully.....");
}
}