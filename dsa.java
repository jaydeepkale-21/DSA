
import java.util.*;
import javax.print.attribute.standard.OutputBin;
public class dsa{
public static void main(String[] args) {
DiamandPAtten(5);
 
}

// public static void Hollow_Rect(int rowNum,int ColNum)
// {
//   for(int i=1;i<=rowNum;i++){
//   for(int j=1;j<=ColNum;j++){
//     if(i==1||i==4||j==1||j==5){
//        System.out.print("*");
//     }
//     else  {
//       System.out.print(" ");
//     }
   
//   }
//   System.out.println();
// }
// }

// ----Inverted & Roteted Half-Pyramid---
// public static void Inv_HAlf_PYramid(int rowNum,int ColNum){
// for(int i=1;i<=rowNum;i++){
//   for(int j=1;j<=rowNum-i;j++){
//     System.out.print(" ");
//   }
//   for(int k=1;k<=i;k++){
//     System.out.print("*");
//   }
//   System.out.println();
//   }
// }

// -------Inverted Half-Pyramid With number---
// public static void Inv_HAlf_PYramid_number(int rowNum){
//   for(int i=1;i<=rowNum;i++){
//     for(int j=1;j<=rowNum-i+1;j++){
//       System.out.print(j);
//     }
//     System.out.println();
  // }
// }


// floyds_trinagle
// public static void floyds_trinagle(int n){
//   int count=0;
//   for(int i=1;i<=n;i++){
//     for(int j=1;j<=i;j++){
      
//       System.out.print(count);
//       count++;
//     }
//     System.out.println();
//   }
// }

//  0-1 Triangle
// public static void Triangle01(int n){
//   // boolean bol=true;
// for(int i=1;i<=n;i++){
//   for(int j=1;j<=i;j++){
//   if((i+j)%2==0){
//     System.out.print("1");
//   }
//   else{
//     System.out.print("0");
//   }
//   }
//   System.out.println();
// }
// }
// Output is:
// 1
// 01
// 101
// 0101
// 10101


// Butterfly pattern
// public static void Butterfly(int n){
// for(int i=1;i<=n;i++){
//   for(int j=1;j<=i;j++){
//     System.out.print("*");
//   }
//   for(int k=1;k<=(n-i)*2;k++){
//     System.out.print(" ");
//   }
//   for(int f=1;f<=i;f++){
//     System.out.print("*");
//   }
//   System.out.println();
// }
// for(int i=n;i>=1;i--){
//   for(int j=1;j<=i;j++){
//     System.out.print("*");
//   }
//   for(int k=1;k<=(n-i)*2;k++){
//     System.out.print(" ");
//   }
//   for(int f=1;f<=i;f++){
//     System.out.print("*");
//   }
//   System.out.println();
// }
// }
// Output:
// *        *
// **      **
// ***    ***
// ****  ****
// **********
// **********
// ****  ****
// ***    ***
// **      **
// *        *

// Hollw rombus
// public static void rombus(int n){
//   for(int i=1;i<=n;i++){
//     for(int j=i;j<=n;j++){
//       System.out.print(" ");
//     }
//     for(int j=1;j<=n;j++){
//       System.out.print("*");
//     }
//     System.out.println();
//   }
// }
// Output:
//      *****
//     *****
//    *****
//   *****
//  *****


//Hollow rhombus
// public static void whole_rhom(int n){
//   for(int i=1;i<=n;i++){
//     for(int j=1;j<=n-i;j++){
//       System.out.print(" ");
//     }
//     for(int j=1;j<=n;j++){
//       if(i==1 || i==n || j==1 || j==n){
//         System.out.print("*");
//       }
//       else{
//         System.out.print(" ");
//       }
//     }
//     System.out.println();
//   }
// }
// Output:
//    *****
//    *   *
//   *   *
//  *   *
// *****

//Diamand patten
public static void DiamandPAtten(int n){
for(int i=1;i<=n;i++){
  for(int j=1;j<=n-i;j++){
    System.out.print(" ");
  }
//  for(int k=1;k<=i;k++){
//   System.out.print("*");
// }
//  for(int k=i-1;k>=1;k--){
//   System.out.print("*");
// }
for(int k=1;k<=2*i-1;k++){
  System.out.print("*");
}
System.out.println();
}
for(int i=n;i>=1;i--){
  for(int j=1;j<=n-i;j++){
    System.out.print(" ");
  }
//  for(int k=1;k<=i;k++){
//   System.out.print("*");
// }
//  for(int k=i-1;k>=1;k--){
//   System.out.print("*");
// }
for(int k=1;k<=2*i-1;k++){
  System.out.print("*");
}
System.out.println();
}
}
// output:
//     **
//    ****
//   ******
//  ********
// **********
// **********
//  ********
//   ******
//    ****
//     **




 }









