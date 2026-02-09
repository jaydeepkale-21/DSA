package oops;

import java.util.Scanner;

class complex{
    int real_part1;
    int img_part1;
    int real_part2;
    int img_part2;
     void get_num(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the 1 real part number: ");
        real_part1=sc.nextInt();
         System.out.print("Enter the 2 real part number: ");
        real_part2=sc.nextInt();
        System.out.print("Enter the 1 img part number: ");
        img_part1=sc.nextInt();
         System.out.print("Enter the 2 img part number: ");
        img_part2=sc.nextInt();
    }
    void add(){
      System.err.println("Addtion of complex number: "+((real_part1+real_part2)+" "+(img_part1+img_part2)+"i"));
    }
    void multiply(){
       int real_part=(real_part1*real_part2)-(img_part1*img_part2);
       int img_part=(real_part1*img_part2)-(real_part2*img_part1);
       System.out.println("Multiple is :"+real_part+" "+img_part+"i");
    }
    void differnce(){
         System.err.println("Differnce of complex number: "+((real_part1-real_part2)+" "+(img_part1+img_part2)+"i"));
    }
}
public class oop_consept_assignmet {
public static void main(String[] args){
    complex c=new complex();
    c.get_num();
    c.add();
    c.multiply();
    c.differnce();
}
    
}
