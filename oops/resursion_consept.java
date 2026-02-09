package oops;

public class resursion_consept{
    // printing number 10- to 1
    public static void print_numdec(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.print(n+" ");
        print_numdec(n-1);
    }
    //call method to another
    public static void pritn(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        print_numdec(n-1);
        System.out.println(n);
    }
    // print number 1 to n
    public static void print_numinc(int start,int end){
        if(start==end){
            System.out.print(end);
            return;
        }
        System.out.print(start+" ");
        print_numinc(start+1, end);
    }
    public static void main(String args[]){
        int start=1;
        int end=10;
       pritn(end);
    }    
}
