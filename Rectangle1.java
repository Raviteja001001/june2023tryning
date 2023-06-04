class Rectangle{
int length;
int width;
void insert(int l,int w){
length=l;
width=w;      
}

void calculateRecords()
{
System.out.println(length*width);
}
}
public class Rectangle1{
public static void main(String args[]){
Rectangle r1=new Rectangle();
Rectangle r2=new Rectangle();
r1.insert(11,22);
r2.insert(33,44);
r1.calculateRecords();
r2.calculateRecords();
}
}
