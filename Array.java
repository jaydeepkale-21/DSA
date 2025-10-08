public class Array {

    // linear Seacrching in Array
    //  public static int update(int arr[],int key){
    //   for(int i=0;i<arr.length;i++){
    //     if(arr[i]==key){
    //         return i;
    //     }
    //   }
    //   return -1;
    //     }

    // Check Largest number in Array
    public static void largest_num(int arr[]){
        int largest=0;
        for(int i=0;i<arr.length;i++){
            if(largest<arr[i]){
                largest=arr[i];
            }
        }
        System.out.println(largest);
    }
    public static void main(String[] args) {
  int arr[]={1,2,6,3,9};
  largest_num(arr);
}
}
