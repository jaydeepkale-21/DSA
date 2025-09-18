import java.util.*;
public class dsa{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a binary number:");
  int num=sc.nextInt();
  decimalTObinary(num);
}

// ---------binary to decimal

//   public static void binTOdecimal(int num){
//     int decimal=0;
//     int i=0;
//   while(num>0){
//     int last_digit=num%10;
//     decimal=decimal+(last_digit*(int)Math.pow(2,i));
//     num/=10;
//     i++;
//   }
//   System.out.println(decimal);
//   }

// ------------decimal to binary-----------
public static void decimalTObinary(int num){
    int pow=0;
    int binNum=0;
    while(num>0){
        int rem=num%2;
       binNum=binNum+(rem*(int)Math.pow(10,pow));
       pow++;
       num/=2;
    }
    System.out.println("binary number is:"+binNum);
    }
  }








