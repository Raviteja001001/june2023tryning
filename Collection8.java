import java.io.*;
import java.util.*;
class Collection8{
public static void main(String args[]){
Vector<String> an=new Vector<>();
an.add("dog");
an.add("cat");
an.add("cow");
System.out.println("vector is:"+an);
String s=an.get(2);
System.out.println("Element at index 2 is:"+s);
Iterator<String> i= an.iterator();
System.out.println("vector is:");
while(i.hasNext()){
System.out.print(i.next());
System.out.print(",");
}
}
}