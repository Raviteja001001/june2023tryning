import java.io.*;
import java.util.*;
class Collection4{
public static void main(String args[]){
List<Integer> an=new LinkedList<>();
an.add(33);
an.add(22);
an.add(11);
System.out.println("list is:"+an);
int an1=an.get(2);
System.out.println("Accessed number is:"+an1);
int an2=an.indexOf(22);
System.out.println("position of 3 is:"+an2);
int rn=an.remove(1);
System.out.println("remove element is:"+rn);
System.out.println("list is:"+an);
}
}