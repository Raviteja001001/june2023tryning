class Employe{
int id;
String name;
float salry;
void insert(int i,String n,float s){
id=i;
name=n; 
salry=s;      
}

void displayRecords()
{
System.out.println(id+" "+name+" "+salry);
}
}
public class Employe1{
public static void main(String args[]){
Employe e1=new Employe();
Employe e2=new Employe();
Employe e3=new Employe();
e1.insert(111,"ravi",5514);
e2.insert(222,"ramu",8776);
e3.insert(333,"pandu",6722);
e1.displayRecords();
e2.displayRecords();
e3.displayRecords();
}
}
