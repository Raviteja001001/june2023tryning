import java.util.Scanner;
public class Power {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the value:");
        int a=s.nextInt();
        System.out.println("eneter the power:");
        int b=s.nextInt();
        int c=1;
        for(int i=1;i<=b;i++){
            c=c*a;
        }
        System.out.println("Results:"+c);
    }
}
