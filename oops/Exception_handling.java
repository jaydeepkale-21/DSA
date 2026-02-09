package oops;
public class Exception_handling {
    public static void main(String args[]){
    //     int nums[]={1,2,3,4};
    //      int suffix[]=new int[nums.length];
    //      int c=0;
    //     int count=nums[c];
    //     for(int i=0;i<nums.length;i++){
    //       if(nums[i]==count){
    //         i++;
    //         c++;
    //       }
    //        System.out.println(nums[i]);
    // }

    int nums[]={1,2,3,4};
    int answer[]=new int[nums.length];
    for(int i=0;i<nums.length;i++){
      int product=1;
      for(int j=0;j<nums.length;j++){
        if(i!=j){
         product*=nums[j];
        }
        
      }
      answer[i]=product;
      System.out.println(answer[i]);
    }
}
    }
