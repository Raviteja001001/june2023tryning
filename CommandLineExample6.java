class CommandLineExample6{
public static void main(String args[]){
float a=Float.parseFloat(args[0]);
float b=Float.parseFloat(args[1]);
System.out.println(a+b);
double c=Double.parseDouble(args[0]);
double d=Double.parseDouble(args[1]);
System.out.println(c+d);
String e=String.parseString(args[0]);
String f=String.parseString(args[1]);
System.out.println(e+f);
}
}