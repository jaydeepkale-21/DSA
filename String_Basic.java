
import java.util.Scanner;

public class String_Basic {
    public static void print_char(String name){
        for(int i=0;i<name.length();i++){
            System.out.print(name.charAt(i)+" ");
        }
        System.out.println();
    }
    // Check plindrome String
    public static boolean ispliandrome(String name){
        for(int i=0;i<name.length();i++){
             int n=name.length();
            if(name.charAt(i)!=name.charAt(n-1-i)){
                System.out.println("this String is not pliandrome");
                return false;
            }
        }
        return true;
    }
   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // //  String name=sc.next();  //  --> Give only one word not input al string
        String name=sc.nextLine();  // --> Give full sentence t time
        System.out.println(name);
        // System.out.println(name.length());
        // System.out.println(name.charAt(0));
    System.out.println(ispliandrome(name));

    }
}
