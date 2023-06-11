import java.util.*;
public class ReplaceAllString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String c=sc.next();
        String r=sc.next();
        String res=s.replaceAll(c,r);
        System.out.print(res);
    }
}
