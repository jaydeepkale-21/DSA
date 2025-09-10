
import java.util.Scanner;

public class dsa{
    public static void main(String[] args) {
        int marks;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your marks:");
        marks=sc.nextInt();
        if(marks>=35){
            if(marks>=70){
                System.out.println("you pass and give you grade 'A'");
            }
            else{
                System.out.println("you only pass give grade 'B'");
            }
        }
        else{
            System.out.println("fail and give garde 'F'");
        }
    }
}