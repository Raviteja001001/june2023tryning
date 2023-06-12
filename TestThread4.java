import java.io.*;
class TestThread4 {
public static void main(String args[]){
Thread td=new Thread();
System.out.println("CURRENTTHREAD="+td);
td.setName("NEW Threadby ravi");
td.setPriority(td.getPriority()-1);
System.out.println("CURRENTTHREAD="+td);
System.out.println("NAME="+td.getName());

}
}