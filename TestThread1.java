import java.io.*;
class TestThread1 extends Thread{
public static void main(String args[]){
TestThread1 td=new TestThread1();
td.start();
System.out.println("this code is outsaid of the thread");
}
public void run(){
System.out.println("this code is running of the thread");
}
}