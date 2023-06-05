import java.util.Scanner;
public class SumDigit {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("eneter the value:");
        int a=s.nextInt();
        int b=0;
        while(a>0){
            b=b+a%10;
            a=a/10;

        }
        System.out.println(b);

    }
}
