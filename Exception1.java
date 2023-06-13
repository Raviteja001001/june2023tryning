class Exception1{
public static void main(String args[]){
try{
int d=10/0;
int p=20;
}
catch(ArithmeticException e){System.out.println(e);}
System.out.println("rest of the code...");
}
}