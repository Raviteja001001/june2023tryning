import java.io.*;
class FileReadCountDigit{
public static void main(String args[])throws Exception{
FileReader fr=new FileReader("E:\\ravi\\demo.txt");
BufferedReader br=new BufferedReader(fr);
int i;
int cd=0;
while((i=br.read())!=-1){

if(((char)i>='0')&&((char)i<='9'))
cd++;}
System.out.print(cd);
br.close();
fr.close();
}
}