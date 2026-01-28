public class BitManipalution{
    // Find odd & even by useing bitwise opertor
    public static void oddeven(int n){
        int bitmask=1;
        if((n&bitmask)==0){
            System.out.println("Number is even");
        }
        else{
            System.out.println("number is odd");
        }
    }

    // Get ith position bit
    public static int get_i_position(int n,int i) {
        int bitmask=1<<i;  // By this '1' go to ith position
        if((n&bitmask)==0){  // then check '0' or '1'-->  then get ith position value...
            return 0;
        }
        else{
            return 1;
        }
    }

    // Set ith position
    public static int set_ith_position(int n, int i){
        int bitmask=1<<i;
        return n|bitmask;   //They change ith position bit to '1' becasue--> 0 or 1=1,, 1 or 0=1
    }

    //Clear ith bit at position-> chaange to '0';
    public static int clear_bit(int n, int i) {
        int bitmask=~(1<<i);
        return n&bitmask;
    }
    //  update ith bit
    public static int update(int n, int i, int newbit){
        // if(newbit==0){
        //     return clear_bit(n, i );
        // }
        // else{
        //     return set_ith_position(n, i);
        // }
        n=clear_bit(n, i);
        int bit_mask=newbit<<i;
        return n|bit_mask;
    }

    // clear last ith bit
    public static int clear_last_bit(int n, int i){
        int bitmask=(~0)<<i;
        return n&bitmask;
    }

    // clear range of bit
    public static int clear_range(int n, int i,int j){
        int a=(~0)<<j;
        int b=(1<<i)-1;
        int bitmask=a|b;
        return bitmask&n;
    }

    // check number power of '2' or not 
    public static void check_2power(int n){
        int bitamsk=n-1;
        if((n&bitamsk)==0){
            System.out.println("number is 2 power");
        }
        else{
            System.out.println("not 2 power");
        }
    }

    // count set bit(no of '1 present') i the number.
    public static int count_setbit(int n){
        int count=0;
        while(n>0){
            if((n&1)!=0){
                count++;
            }
            n=n>>1;
        }
        return count;
    }

    // Fast exponetation calclute 
    public static int fact_Exponetation(int n,int a){
        int ans=1;
        while(n>0){
            if((n&1)!=0){
            ans=ans*a;
            }
            a=a*a;
            n=n>>1;
        }
        return ans;
    }

    // Swap elemet without useing third variable
    public static void swap_number(int a, int b){
        System.out.println("before swap element: "+a+" "+b);
        a=a^b;
        b=a^b;
        a=a^b;
        
         System.out.println("after swap element: "+a+" "+b);
    }

    // Add 1 to an interger using bit manipulation.
    // 5->6, 7->8 sol-> ~5=-6 because ~5=111000 MSB->represnet positive(0) or negative(1)
    // ~111000=000101 Apply 2`s complemet-> 000101+1=000110(6)
    public static int add_one_interger(int n){
        return -(~n);
    }

    // Coverting uppercase to lowercase charater
    public static void covertion(){
    //     int a=ch;//--> it my logic
    //     a=a+32;
    //    System.out.println((char)a);
    for(char ch='A';ch<='Z';ch++){
        System.out.println((char)(ch|' '));
    }
    }
    public static void main(String args[]){
        //System.out.println(5&6);   //--> bitwise AND
        // System.out.println((5|7));//--> bitwise OR
        // System.out.println((~0));//-->  bitwise 1s complement
        // System.out.println(5<<3); //-->  bitwies leftshit
        covertion();
    }  
} 