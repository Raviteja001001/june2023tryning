import java.util.Scanner;
public class ReverceString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s;
        String st="";
        System.out.println("enter the String:");
        s=sc.next();
        int len=s.length()-1;
        for(int i=len;i>=0;i--){
            st=st+s.charAt(i);
        }
        System.out.println(st);

    }
}
