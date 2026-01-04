public class Problem_2DArray {
    //Q1-> Print the number of 7’s that are inthe 2d array
    // public static void find_7(int arr[][],int key){
    //     int count=0;
    //     for(int i=0;i<arr.length;i++){
    //         for(int j=0;j<arr[i].length;j++){
    //             if(arr[i][j]==key){
    //                 count++;
    //             }
    //         }
    //     }
    //     System.out.println("Elemet are occur: "+count);
    // }

    //Q2-> Print out the sum of the numbers in the second row of the “nums” array.
    // public static void Sum_2Row(int nums[][]){
    //     int sum=0;
    //     for(int i=0;i<nums[1].length;i++){
    //         sum+=nums[1][i];
    //     }
    //     System.out.println("Scond Row sum is: "+sum);
    // }

    // Q3->Write a program to FindTransposeofa Matrix.
    // What is Transpose?
    // Transpose of a matrix is the process ofswapping therows to columns. For a 2x3 matrix
    public static void Transpose(int arr[][],int result[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                result[j][i]=arr[i][j];
            }
        }
    }
    public static void print(int result[][]){
        System.out.println("Transpose matrix is: ");
        for(int i=0;i<result.length;i++){
            for(int j=0;j<result[i].length;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
        int result[][]=new int[nums[0].length][nums.length];
       Transpose(nums, result);
       print(result);
    }
}
