import java .util.Scanner;
class InputDayNumber2{
public static void displayDay(int n)
{
switch(n)
{
case 0:System.out.println("SUNDAY");break;
case 1:System.out.println("MoNDAY");break;
case 2:System.out.println("TEUSDAY");break;
case 3:System.out.println("WEDNESDAY");break;
case 4:System.out.println("THURSDAY");break;
case 5:System.out.println("FRIDAY");break;
case 6:System.out.println("SATURDAY");break;
default:System.out.println("INVALID");
}
}
public static void main(String arg[]){
Scanner scob=new Scanner(System.in);
System.out.println("Enter the number:");
int day;
day=scob.nextInt();
displayDay(day);
}
}