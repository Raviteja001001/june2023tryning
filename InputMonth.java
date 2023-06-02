import java .util.Scanner;
class InputMonth{

public static void main(String arg[]){
Scanner scob=new Scanner(System.in);
System.out.println("enter the number");
int mt;
mt=scob.nextInt();
switch(mt)
{
case 1:System.out.println("JANVERY");break;
case 2:System.out.println("FEBRAVERY");break;
case 3:System.out.println("MARCH");break;
case 4:System.out.println("APRILY");break;
case 5:System.out.println("MAY");break;
case 6:System.out.println("JUNE");break;
case 7:System.out.println("JULY");break;
case 8:System.out.println("AUGEST");break;
case 9:System.out.println("SEPTEMBER");break;
case 10:System.out.println("oCToBER");break;
case 11:System.out.println("NoVEMBER");break;
case 12:System.out.println("DECEMBER");break;
default:System.out.println("INVALID");
}
}
}
