class Exception7{
public static void main(String args[]){
int a=10;
int b=0;
int c;
try{
c=a/b;
}
catch(ArithmeticException e){System.out.println(a/(b+2));}
System.out.println("rest of the code...");
}
}