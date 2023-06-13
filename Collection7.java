import java.io.*;
import java.util.*;
class Collection7{
public static void main(String args[]){
Vector<String> an=new Vector<>();
an.add("dog");
an.add("cat");
an.add("cow");
System.out.println("vector is:"+an);
Vector<String> an1=new Vector<>();
an1.add("crocodile");
an1.addAll(an);
System.out.println("new vector is:"+an1);

}
}