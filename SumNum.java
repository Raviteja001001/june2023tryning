import java.util.Scanner;
public class SumNum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int b=s.nextInt();
        int a=0;
        for(int i=1;i<=b;i++){
            a=a+i;
        }
        System.out.println("sum of:"+a);
    }
}
