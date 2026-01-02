public class search{
    public static int bin(int arr[],int key){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
              int mid=(start+end)/2;
                if(arr[mid]==key){
                    return mid;
                }
                else if(arr[mid]>key){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            return -1;
        }
    public static void main(String[]args){
        int arr []={2,3,4,5,6,7,8,9};
    //     int key=5;
    //     int result=bin(arr,key);
    //   if(result!=1){
    //     System.out.println("found: "+result);
    //   }
    //   else{
    //     System.out.println("not found");
    //   }
    }
}