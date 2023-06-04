class Test7{
int rollno;
String name;
void insretRecords(int r,String n){
rollno=r;
name=n;
}

void displayRecords()
{
System.out.println(rollno+" "+name);
}
}
class Test9{
public static void main(String args[]){
Test7 t1=new Test7();
Test7 t2=new Test7();
t1.insretRecords(111,"ravi");
t2.insretRecords(222,"hari");
t1.displayRecords();
t2.displayRecords();
}
}
