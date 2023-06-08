class Student{
int rollno;
String name;
static String college="MTIET";
static void change(){
college="MOTHERTErESA";
}
Student(int r,String n){
rollno=r;
name=n;
}
void display(){ 
System.out.println(rollno+""+name+""+college);
}
}
class Student1{
public static void main(String args[]){
Student s1=new Student(111,"sduyft");
Student s2=new Student(111,"raju");
Student s3=new Student(111,"pravven");
s1.display();
s2.display();
s3.display();

}
}