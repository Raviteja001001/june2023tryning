class Emp{
int id;
String name;
Address address;
public Emp(int id,String name,Address address){
this.id=id;
this.name=name;
this.address=address;
}
void display(){

System.out.println(id+""+name);
System.out.println(address.city+""+address.state+""+address.country);

}
public static void main(String args[]){
Address address1=new Address("tirupathi","Ap","india");
Address address2=new Address("chittoor","Ap","india");
Emp e1=new Emp(11,"ravi",address1);
Emp e2=new Emp(22,"teja",address2);
e1.display();
e2.display();
} 
}