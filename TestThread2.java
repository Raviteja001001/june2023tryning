import java.io.*;
class TestThread2 extends Thread{
public static void main(String args[]){
TestThread2 tt=new TestThread2();
Thread td=new Thread(tt);
td.start();
System.out.println("this code is outsaid of the thread");
}
public void run(){
System.out.println("this code is running of the thread");
}
}