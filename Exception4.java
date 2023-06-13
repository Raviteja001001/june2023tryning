class Exception4{
public static void main(String args[]){
try{
int a=10/0;
}
catch(ArithmeticException e){System.out.println(e);}
System.out.println("rest of the code...");
//String s="null";
//int i=Integer.parseInt(s);//numberformateccetion
//int a[]=new int[5];
//a[10]=20;//arrayindexoutofbound exception.
}
}