import java.util.Scanner;
public class Product
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int b=s.nextInt();
        int a=1;
        for(int i=1;i<=b;i++){
            a=a*i;
        }
        System.out.println("Factorial is:"+a);
    }
}
