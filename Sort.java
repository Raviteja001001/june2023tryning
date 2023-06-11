import java.util.*;
import java.util.Arrays;
class Sort{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("Enter no.of elements you want in array:");
int x=s.nextInt();
int sum=0,i=0,temp=0,j=0;
int a[]=new int[x];
System.out.println("Enter the all elements:");
for(i=0;i<x;i++){
a[i]=s.nextInt();
}
Arrays.sort(a);
System.out.println(a[0]+" "+a[x-1]);
for(int y:a){sum +=y;}
float avg=(float)sum/x;
System.out.println(sum+"\n"+avg);
System.out.println("second largest num:"+a[x-2]);

}
}

