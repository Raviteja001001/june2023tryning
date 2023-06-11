import java.util.*;
public class Triangle {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        for(int i=0;i<=a;i++){
            System.out.println();
            for(int j=a;j>i;j--){
                System.out.print("*");
            }
        }
    }
}
