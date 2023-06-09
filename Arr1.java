import java.util.*;
class Arr1{
public static void main(String args[]){
int[] age={1,2,3,4,5};
int b=0;
for(int a: age){
b += a;
}
int ArreLength=age.length;
double average=((double)b/(double)ArreLength);
 System.out.println("sum:"+b);
 System.out.println("avarege:"+average);
}
}