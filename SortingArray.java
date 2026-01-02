import java.util.*;
public class SortingArray{

    // Bubble sort
    // public static void Bubblesort(int arr[]){
    //     for(int turn=0;turn<arr.length-1;turn++){
    //         int count=0;
    //         for(int j=0;j<arr.length-1;j++){
    //             if(arr[j]>arr[j+1]){
    //                 int temp=arr[j];
    //                 arr[j]=arr[j+1];
    //                 arr[j+1]=temp;
    //                 count++;
    //             }
    //         }
    //          if(count==0){
    //                 System.out.println("Array was sort not be need to sort");
    //                 break;
    //             }
    //     }
    // }
    // public static void printarray(int arr[]){
    //     for(int i=0;i<arr.length;i++){
    //     System.out.print(arr[i]+" ");
    //     }
    // }

    // Selection sort
    // public static void SelectioSort(int arr[]){
    //     for(int j=0;j<arr.length-1;j++){
    //         int minpos=j;
    //     for(int i=j+1;i<arr.length;i++){
    //        if(arr[minpos]>arr[i]){
    //         minpos=i;
    //        }
    //     }
    //     // swap
    //     int temp=arr[minpos];
    //     arr[minpos]=arr[j];
    //     arr[j]=temp;
    // }
    // }

    // Inertion sort
    // public static void insertion_sort(int arr[]){
    //     for(int i=0;i<arr.length;i++){
    //     int curr=arr[i];
    //     int prev=i-1;
    //     while(prev>=0 && arr[prev]>curr){
    //         arr[prev+1]=arr[prev];
    //         prev--;
    //     }
    //     // insertion 
    //     arr[prev+1]=curr;
    //     }
    // }

    // Counting Sort
    public static void Counting_sort(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest=Math.max(largest, arr[i]);
        }
        int count[]=new int[largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
            //count[3]-> store in position index=3
            //count[5]-> store in position index=5
            //count[2]-> store in position index=2
            //count[1]-> store in position index=1
            //count[6]-> store in position index=6
        }
        // Sorting
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                // System.out.print(count[i]); o/p=2,1,2,1,2,1,1,2,1,1
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }
    public static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
       int arr[]={3,5,2,1,6,6,3,2,1};
        // Inbulit sort
        // // Arrays.sort(arr);
        // Arrays.sort(arr,3,arr.length);

        // Reverse array sort
        // Arrays.sort(arr, Collections.reverseOrder());
        Counting_sort(arr);
       printarray(arr);

    }
}