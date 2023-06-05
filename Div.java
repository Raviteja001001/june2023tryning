import java.util.Scanner;
public class Div {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        if(b==0){
            System.out.print("division by ZERO is the error:");
        }
        else{
            System.out.println(a+" divided by "+b+"is :"+(a/b));
        }
    }
}
