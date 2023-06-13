class Exception6{
public static void main(String args[]){
try{
int a=10/0;

}
catch(ArithmeticException e){System.out.println("cant divided by zero");}
System.out.println("rest of the code...");
}
}