class Test7{
int rollno;
String name;
Test7()
{
rollno=0;name=null;
}
Test7(int r,String n)
{
rollno=r;
name=n;       
}

void displayRecords()
{
System.out.println(rollno+" "+name);
}
}
class Test10{
public static void main(String args[]){
Test7 t1;
t1=new Test7();
Test7 t2=new Test7(111,"ravi");
t1.displayRecords();
t2.displayRecords();
}
}
