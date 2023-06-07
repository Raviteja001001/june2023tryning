import java.util.*;
class Student{
int rollno;
String name;
float fee;
Student(int rollno,String name,float fee){
this.rollno=rollno;
this.name=name;
this.fee=fee;
}

void display(){
System.out.println(rollno+""+name+""+fee);
}
}
class TestThis{
public static void main(String args[]){
Student s1=new Student(11,"ravi",200);
Student s2=new Student(12,"praveen",900);

s1.display();
s2.display();




}
}