import java.util.Scanner;
public class Palindrom {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("eneter the your number:");
        String rs="";
        String n=s.next();
        int len=n.length()-1;
        for(int i=len;i>=0;i--){
            rs=rs+n.charAt(i);
        }
        if(n.equals(rs)){
            System.out.println("palindrom");
        }
        else{
            System.out.println("not palindrom");
        }
    }
}
