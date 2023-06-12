import java.io.*;
class CharArrayExample{
public static void main(String args[])throws Exception{
char[] ary={'t','r','d','f','w'};
CharArrayReader r=new CharArrayReader(ary);
int k=0;

while((k=r.read())!=-1){
char ch=(char)k;
System.out.print(ch+":");
System.out.println(k);

}
}
}