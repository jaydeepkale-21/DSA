public class TripRainWater {
    public static int TripWater(int height[]) {
        int n=height.length;
        // Left max array
        int left_max[]=new int[n];
        left_max[0]=height[0];
        for(int i=1;i<n;i++){
            left_max[i]=Math.max(left_max[i-1],height[i]);
        }

        // Right Max Array
        int right_max[]=new int[n];
        right_max[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            right_max[i]=Math.max(right_max[i+1], height[i]);
        }

        // TripWater
        int tripwater=0;
        for(int i=0;i<n;i++){
            int water_level=Math.min(left_max[i], right_max[i]);
            tripwater+=water_level-height[i];
        }
        return tripwater;

    }
    public static void main(String[] args) {
        int height[]={1,9,4,3,10};
        System.out.println("TripWater is: "+TripWater(height));
    }
}
