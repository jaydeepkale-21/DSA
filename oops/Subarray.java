package oops;

public class Subarray {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int k=3;
        int min_index=0;
        int max_index=0;
        for(int i=0;i<arr.length-(k-1);i++){
            int sum=0;
            for(int j=i;j<i+k;j++){
                sum+=arr[j];
                System.out.print(arr[j]+" ");
               
            }
             System.out.println("="+sum);
             if(sum<min){
                min=sum;
              min_index=i;
             }
             if(sum>max){
                max=sum;
                max_index=i;
             }
        }
         System.out.println("Minimum sum: "+min+" index at: "+min_index+" avg is: "+(min/k));
         System.out.println("Maximum sum: "+max+" index at: "+max_index+" avg is: "+(max/k));
    }
    
}
