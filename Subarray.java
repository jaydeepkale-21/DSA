public class Subarray {
    
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

    // prefix array -->approch
// public static void prefixArray(int number[]){
//     int sum=0;
//     int prefixarr[]=new int[number.length];
//     int max=Integer.MIN_VALUE;

//     // calculatin prefix array
//     prefixarr[0]=number[0];
//     for(int i=1;i<prefixarr.length;i++){
//         prefixarr[i]=prefixarr[i-1]+number[i];
//     }
//     for(int i=0;i<number.length;i++){
//         int start=i;
//       for(int j=i;j<number.length;j++){
//         int end=j;
//         sum=start==0?prefixarr[end]:prefixarr[end]-prefixarr[start-1]; //ternery opertor
//       if(max<sum){
//         max=sum;
//       }
//       }
//     }
//     System.out.println("max sum subarray: "+max);
// }


// Kandan's Algorithim
public static void kandan(int number[]){
  int currsum=0;
  int maxsum=Integer.MIN_VALUE;
  int minsum=Integer.MAX_VALUE;
  // int minsum=0;
  int count=0;
  for(int i=0;i<number.length;i++){
    // check how many elemant are negative
    if(number[i]<0){
      count++;
    }
    currsum=currsum+number[i];
    if(currsum<0){
      currsum=0;
    }
    maxsum=Math.max(currsum, maxsum);
  }
   System.out.println("Max sum subarray: "+maxsum);
  // it give min value in negative array
  
  if(count==number.length){
    maxsum=Integer.MIN_VALUE;
    minsum=Integer.MAX_VALUE;
    for (int i = 0; i <number.length; i++){
     
       minsum=Math.min(number[i], minsum);
       maxsum=Math.max(number[i], maxsum);
    }
    System.out.println("Mininum value in negative array: "+minsum);
   System.out.println("Maxmum value in negative array: "+maxsum);
      }
}
    public static void main(String[] args) {
        int number[]={-3,80,-3,-4,-10};
        kandan(number);
    }
}

