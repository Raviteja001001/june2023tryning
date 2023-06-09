import java.util.*;
class SearchElement{
public static void main(String args[]){
int n,x,i=0;
int flag=0;
Scanner s=new Scanner(System.in);
System.out.println("Enter no.of elements you want in array:");
n=s.nextInt();
int a[]=new int[n];
System.out.println("Enter the all elements:");
for(i=0;i<n;i++){
a[i]=s.nextInt();
}
System.out.println("Enter the elements you want to find:");
x=s.nextInt();
for(i=0;i<n;i++){
if(a[i]==x){
flag=1;
break;
}
else
{
flag=0;
}
}//for
if(flag==1)
{ System.out.println("enter found at position:"+(i+1));}
else
{ System.out.println("Element not found");}
}
}

