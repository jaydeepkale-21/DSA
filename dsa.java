
import java.util.Scanner;


public class dsa{
    public static void main(String[] args) {
//   loop-> Loop are use to perform repetaed task
// -----------while loop--------
// int n;
// Scanner sc=new Scanner(System.in);
// System.out.println("enter number to give count:");
// n=sc.nextInt();
// int num=1;
// int sum=0;
// while(num<=n){
//     System.out.print(num+" ");
//     sum+=num;
//     num++;
// }
// System.out.println("sum on n natural number:"+sum);


// -------------for loop------
// int n=10899;
int reverse=0;
// for(int i=1;i<6;i++){
//     reverse=n%10;
//     n/=10;
//       System.out.print(reverse);
// }
int n=10899;
while(n>0){
    reverse=n%10;
    System.out.print(reverse);
    n/=10;
  
}
    

     }
    }
