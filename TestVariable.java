class Student{
int rollno;
String name;
static String college="MTITE";
Student(int r,String n){
rollno=r;
name=n;
}
void display(){
System.out.println(rollno+""+name+""+college);
}
}
class TestVariable{
public static void main(String args[]){
Student s1=new Student(111,"ravi");
Student s2=new Student(111,"raju");
Student.college="MOTHER TERESA";
s1.display();
s2.display();
}
}