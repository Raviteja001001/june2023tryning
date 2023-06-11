import java.util.*;
class RemoveStr{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char c=sc.next().charAt(0);
        int a=s.charAt(0);
        for(int i=0;i<=s.length()-1;i++){
            if(c!=s.charAt(i))
            System.out.print(s.charAt(i));
        }
    }
}