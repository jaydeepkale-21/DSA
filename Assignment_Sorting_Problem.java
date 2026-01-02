public class Assignment_Sorting_Problem {
    // Bubble Sortb.
    // Selection Sortc.
    // Insertion Sortd.
    // Counting Sort
    // [3,6,2,1,8,7,4,5,3,1]

    // Find largest Elemet and put at the end
    public static void Bubble_Sort(int arr[]){
        for(int i=0;i<arr.length-1;i++){ //Turn of swaping
            int count=0;
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    count++;
                }
            }
            if(count==0){
                System.out.println("already sort the array");
                break;
            }
        }
    }

    // Selection Sort-> find min numbere and swap in the begining.
    //               -> Oppsite of Bubble Sort.
    // public static void Selection_sort(int arr[]){
    //     for(int i=0;i<arr.length-1;i++){
    //         int minpos=i;
    //         for(int j=i+1;j<arr.length;j++){
    //             if(arr[minpos]<arr[j]){   //Decending order
    //                 minpos=j;
    //             }
    //             // swap
    //             int temp=arr[minpos];
    //             arr[minpos]=arr[i];
    //             arr[i]=temp;
    //         }
    //     }
    // }
    
    //Insertion Sort-> Multiply swap elemet and push at the beign small elemet
    // public static void Insertion_Sort(int arr[]){
    //     for(int i=1;i<arr.length;i++){
    //         int curr=arr[i];
    //         int prev=i-1;

    //         // Sorting Algorithim
    //         while(prev>=0 && arr[prev]>curr){
    //             arr[prev+1]=arr[prev];
    //             prev--;
    //         }
    //         // Insertion 
    //         arr[prev+1]=curr;
    //     }
    // }

    // // Counting Sort->
    // public static void Counting_sort(int arr[]){
    //     int largest=Integer.MIN_VALUE;
    //     for(int i=0;i<arr.length;i++){
    //         largest=Math.max(largest, arr[i]);
    //     }
    //     int count[]=new int[largest+1];
    //     for(int i=0;i<arr.length;i++){
    //         count[arr[i]]++;
    //     }
    //     int j=0;
    //     for(int i=count.length-1;i>0;i--){// change condition can made accending and deceding order
    //         while(count[i]>0){
    //         arr[j]=i;
    //         j++;
    //         count[i]--;
    //         }
           
        // }
        
    // }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[]={3,6,2,1};
     Bubble_Sort(arr);
       print(arr);
    }
}
