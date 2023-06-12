import java.io.*;
class First implements Runnable{
Thread t;String s;
First(String name){
s=name;
t=new Thread(this,s);
System.out.println("CHILD:"+t);
t.start();
}
public void run(){
try{
for(int i=5;i>0;i--){
System.out.println(s+":"+i);
Thread.sleep(1000);
}
}
catch(InterruptedException e){}
System.out.println("EXITING :"+s  );
}
}
class TestThread6{
public static void main(String args[]) throws Exception{
new First("ONE");
new First("TWO");
new First("THREE");
try{
Thread.sleep(20000);
}
catch(Exception e){}
System.out.println("Exiting main");
}
}