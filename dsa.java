import java.security.PublicKey;
import java.util.Scanner;
public class dsa{
    //function /method
    public static int sum(int a,int b){
            int sum=a+b;
            return sum;
        }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int addtion =sum(a, b);
    System.out.println("final addtion is:"+addtion);
        }

    }


