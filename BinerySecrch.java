class BinerySecrch{
    // public static int binerySER(int number[],int key){
    //     int start=0;
    //     int end=number.length-1;
        
    //     while(start<=end){
    //         int mid=(start+end)/2;
    //         if(number[mid]==key){
    //             return mid;
    //         }
    //         if(key>number[mid]){
    //             start=mid+1;
    //         }
    //         else {
    //             end=mid-1;
    //         }
    //     }
    //     return -1;
    // }
    

    // Reverse array
    // public static void reverse(int number[]){
    //     int start=0, last=number.length-1;
    //     while(start<last){
    //         int temp=number[last];
    //         number[last]=number[start];
    //         number[start]=temp;
    //         start++;
    //         last--;
    //     }
    // }


    // To find all possiable pair
    // public static void pairofarray(int number[]){
    //     for (int i = 0; i < number.length-1; i++) {
    //         int curr=number[i];
    //         for(int j=i+1;j<number.length;j++){
    //             System.out.print("("+curr+","+number[j]+")");
    //         }
    //         System.out.println();
    //     }
    // }

    // SubArray
    // public static void SubAraay(int number[]){
    //     int start,end;
    //     int count=0;
    //     int max=Integer.MIN_VALUE;
    //     int min=Integer.MAX_VALUE;
    //     for(int i=0;i<number.length;i++){
    //         start=i;
    //          int sum=0;
    //         for(int j=i;j<number.length;j++){
    //          end=j;
    //          sum=sum+number[j];
    //         for(int k=i;k<=j;k++){
    //             System.out.print(number[k]+" ");
    //         }
    //         System.out.println("Sum is: "+sum);
    //           count++;
    //         System.out.println();
    //         // to find maximum sum of SubArray
    //         if(max<sum){
    //         max=sum;
    //         }
    //         // To find Minmum sum of SubArray
    //         if(min>sum){
    //         min=sum;
    //      }
    //     }
    //     System.out.println();
    //     }
    //     System.out.println("Total subarray: "+count);
    //     System.out.println("Maximun number is:"+max);
    //     System.out.println("Minmun number: "+min);
    // }



    // Bruct force Approch -->worst case
    // public static void subarrayMax(int number[]) {
    //     int sum=0;
    //     int max=Integer.MIN_VALUE;
    //     for(int i=0;i<number.length;i++){
    //         for(int j=i;j<number.length;j++){
    //             sum=0;
    //             for(int k=i;k<=j;k++){
    //                 sum+=number[k];
    //             }
    //             System.out.println("subarray sum: "+sum);
    //             if(max<sum){
    //                 max=sum;
    //             }
    //         }
    //     }
    //     System.out.println("Maximum sunarray: "+max);
    // }

public static void prefixArray(int number[]){
    int prefixarr[]=new int[number.length];

    // calculatin prefix array
}
    public static void main(String[] args) {
       int number[]={2,4,6,8,10};
        prefixArray(number);
        // max(52);
    }
}
