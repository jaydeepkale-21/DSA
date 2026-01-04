public class Diagonal_sum {
    // Brude fore approch
    // public static void Diagonal_sum(int arr[][]){
    //     int sum=0;
    //     for(int i=0;i<arr.length;i++){
    //         for(int j=0;j<arr[i].length;j++){
    //             if(i==j){
    //                 sum=sum+arr[i][j];
    //             }
    //         }
    //     }
    //     System.out.println("Digonal sum is: "+sum);
    // }

     public static void  Diagonal_sum(int arr[][]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i][i];
            if(i!= arr.length-1-i){
                sum+=arr[i][arr.length-i-1];
            }
            }
           System.out.println(sum);
        }
    // public static void print_arr(int arr[]){
    //       for(int i=0;i<arr.length;i++){
    //         for(int j=0;j<arr[i].lenght;j++){
    //             System.out.println(arr[i]);
    //         }
    //     }
    

    public static void main(String args[]){
        int arr[][]={{1,2,3,14},
                    {5,6,7,13},
                    {9,10,11,12}};
        Diagonal_sum(arr);
        // print_arr(arr);
    }
    
}
