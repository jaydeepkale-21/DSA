import java.util.Arrays;
import javax.crypto.Mac;
public class ArrayProblem {
    // public static int TripWater(int height[]) {
    //     int n=height.length;
    //     // Left max array
    //     int left_max[]=new int[n];
    //     left_max[0]=height[0];
    //     for(int i=1;i<n;i++){
    //         left_max[i]=Math.max(left_max[i-1],height[i]);
    //     }

    //     // Right Max Array
    //     int right_max[]=new int[n];
    //     right_max[n-1]=height[n-1];
    //     for(int i=n-2;i>=0;i--){
    //         right_max[i]=Math.max(right_max[i+1], height[i]);
    //     }

    //     // TripWater
    //     int tripwater=0;
    //     for(int i=0;i<n;i++){
    //         int water_level=Math.min(left_max[i], right_max[i]);
    //         tripwater+=water_level-height[i];
    //     }
    //     return tripwater;

    // }
    // Brute fore approch
    // public static void ProfitStock(int prize[]){
    //     int min_buy=Integer.MAX_VALUE;
    //     int max=Integer.MIN_VALUE;
    //     for(int i=0;i<prize.length;i++){
    //         int sell=prize[i];
    //         for(int j=i-1;j>=0;j--){
    //             min_buy=Math.min(prize[j],min_buy);
    //             int profit=sell-min_buy;
    //             if(profit>max){
    //                 max=profit;
    //             }
    //             // System.out.println(profit);
    //         }

    //     }
    //     System.out.println("Max profit is: "+max);
    // }

    // Optimisic solution
    // public static void ProfitStock(int prize[]){
    //     int minBuy=Integer.MAX_VALUE;
    //     int maxProfit=0;
    //     for(int i=0;i<prize.length;i++){
    //         if(minBuy<prize[i]){
    //            int profit=prize[i]-minBuy;
    //             maxProfit=Math.max(profit, maxProfit);
                
    //         }
    //         else{
    //             minBuy=prize[i];
    //         }
    //     }
    //     System.out.println("Maximum profit is: "+maxProfit);
    // }
    
    // Q.1->Given an integer array nums, return true if any value appears at least twice in the array,
    //  and return false if every element is distinct

    // Direct Try to Solve it-->Not effective
    // public static void Array_distint(int nums[]) {
    //     boolean bol=true;
    //     for(int j=0;j<nums.length;j++){
    //      int check=nums[j];
    //     for(int i=j+1;i<nums.length;i++){
    //         if(check==nums[j]){
    //             bol=false;
    //             break;
    //         }
    //     }
    //     if(!bol) break;
    // }
    //  if(bol){
    //         System.out.println("false");
    //     }
    //     else{
    //         System.out.println("true");
    //     }
    // }
    
    // Optimiaz solution
    // 1 <= nums .  lengtth <= 105•-109 <= nums [ i ] <= 109
    
    // public static void CheckArr(int nums[]){
    //     Arrays.sort(nums);
    //     boolean bol=true;
    //     for(int i=1;i<nums.length;i++){
    //         if(nums[i]==nums[i-1]){
    //             bol=false;
    //             break;
    //         }
    //     }
    //     if(bol){
    //         System.out.println(true);
    //     }
    //     else{
    //         System.out.println(false);
    //     }
    // }

    // Q2-->Function to search target in rotated sorted array
    // public static int search(int[] nums, int target) {
    //     int left = 0;
    //     int right = nums.length - 1;

    //     while (left <= right) {
    //         int mid = left + (right - left) / 2;

    //         // Check if mid is the target
    //         if (nums[mid] == target) return mid;

    //         // Determine which half is sorted
    //         if (nums[left] <= nums[mid]) { // Left half sorted
    //             if (target >= nums[left] && target < nums[mid]) {
    //                 right = mid - 1; // Target in left half
    //             } else {
    //                 left = mid + 1;  // Target in right half
    //             }
    //         } else { // Right half sorted
    //             if (target > nums[mid] && target <= nums[right]) {
    //                 left = mid + 1;  // Target in right half
    //             } else {
    //                 right = mid - 1; // Target in left half
    //             }
    //         }
    //     }

    //     // Target not found
    //     return -1;
    // }

    // Q3--->You  are  given  an  array prices where prices[i] is  the  price  of  a  given  stock  on  the ith day.
    // Return the maximum profit you can achieve from this transaction. 
    // If you cannot achieve any profit, return 
    // public static void highprofit(int price[]){
    //     int max_Profit=0;
    //     int min_Buy=Integer.MAX_VALUE;
    //     for(int i=1;i<price.length;i++){
    //         int buy=price[i-1];
    //         min_Buy=Math.min(buy, min_Buy);
    //         int profit=price[i]-min_Buy;
    //         if(profit<0){
    //             profit=0;
    //         }
    //         else{
    //             max_Profit=Math.max(max_Profit,profit);
    //         }

    //     }
    //     System.out.println("Maxprofit is: "+max_Profit);
    // }

    // Q3---> optimize version
    //  public static void highprofit(int price[]){
    //     int min_Buy=price[0];
    //     int max_profit=0;
    //     for(int i=1;i<price.length;i++){
    //         int profit=price[i]-min_Buy;

    //         if(profit>max_profit){
    //             max_profit=profit;
    //         }


    //         if(price[i]<min_Buy){
    //             min_Buy=price[i];
    //         }
    //     }
    //    System.out.println("Maxprofit: "+max_profit);
    // }


    // Q4--->Given n non-negative integers representing an elevation map where the width of each bar is 1, 
    //compute how much water it can trap after raining
    public static void Trip(int height[]){
        int size=height.length;
        int trip=0;

        // left auxilliry array
        int left[]=new int[size];
        left[0]=height[0];
        for(int i=1;i<size;i++){
            left[i]=Math.max(left[i-1],height[i]);
        }
        
    // Right auxilliry array
    int right[]=new int[size];
    right[size-1]=height[size-1];
    for(int i=size-2;i>=0;i--){
        right[i]=Math.max(right[i+1], height[i]);
    }

    // Trip water be
    for(int i=0;i<size;i++){
        int refence=Math.min(left[i],right[i]);
        if(refence<height[i]){

        }
        else{
            trip+=refence-height[i];
        }

    }
    System.out.println("water trip total: "+trip);
    }


    public static void main(String[] args) {
       int price[]={4, 2, 0, 3, 2,5};
       Trip(price);

    }
}
