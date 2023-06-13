import java.io.*;
import java.util.*;
class Collection6{
public static void main(String args[]){
ArrayList<String> an=new ArrayList<>();
an.add("33");
an.add("22");
an.add("11");
System.out.println("list is:"+an);
String str=an.get(1);
System.out.println("Element at indent 2:"+str);
str=an.get(2);
System.out.println("Element at indent 2:"+str);
String x=an.set(0,"Ravi");
System.out.println("Replace element is:"+x);
System.out.println("list is:"+an);
for(String a:an){System.out.print(a+" ");}
}
}