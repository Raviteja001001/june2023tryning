import java.io.*;
class CharArrayWriteExample{
public static void main(String args[])throws Exception{
CharArrayWriter out=new CharArrayWriter();
out.write("Wellcome to ravi pleace");
FileWriter f1=new FileWriter("E:\\ravi\\a1.txt");
FileWriter f2=new FileWriter("E:\\ravi\\a2.txt");
FileWriter f3=new FileWriter("E:\\ravi\\a3.txt");
FileWriter f4=new FileWriter("E:\\ravi\\a4.txt");
out.writeTo(f1);
out.writeTo(f2);
out.writeTo(f3);
out.writeTo(f4);
f1.close();
f2.close();
f3.close();
f4.close();
System.out.println("fils is created successfully.....");
}
}