
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
    
    public static void ProfitStock(int prize[]){
        int minBuy=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<prize.length;i++){
            if(minBuy<prize[i]){
               int profit=prize[i]-minBuy;
                maxProfit=Math.max(profit, maxProfit);
                
            }
            else{
                minBuy=prize[i];
            }
        }
        System.out.println("Maximum profit is: "+maxProfit);
    }
    public static void main(String[] args) {
        int prize[]={7,1,10,3,6,4};
        ProfitStock(prize);
       
    }
}
