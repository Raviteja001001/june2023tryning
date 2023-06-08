class Author{
String authorName;
int age;
String place;
Author(String name,int age,String place){
this.authorName=name;
this.age=age;
this.place=place;
}
}
class Book{
String name;
Author author;
int price;
Book(String n,int p,Author author){
this.name=n;
this.price=p;
this.author=author;
}
public static void main(String args[]){
Author author=new Author("janu",32,"USA");
Book b=new Book("java biginer",53,author);
System.out.println("Book name:"+b.name);
System.out.println("Book price:"+b.price);
System.out.println("___Auther details___");
System.out.println("Author name:"+b.author.authorName);
System.out.println("Author age:"+b.author.age);
System.out.println("Author place:"+b.author.place);
} 
}