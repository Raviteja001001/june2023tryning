import java.util.Scanner;
public class MinMax {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        if(a>b){
            System.out.println("a is the bigest number:"+a);
        }
        else{
            System.out.println("b is the bigest number:"+b);
        }
    }
}
