public class Try{
public static void main(String args[]){
    // int number[]={9,5,10,4};
    // int left_max[]=new int[number.length];
    // for(int i=0;i<number.length;i++){
    //     for(int j=i;j>=0;j--){
    //         if(number[i]<number[j])
    //         {
    //             number[i]=number[j];
    //         }
    //     }
    //     left_max[i]=number[i];
    //     System.out.println(left_max[i]);
    // }
    for(int i=1;i<=5;i++){
        for(int j=1;j<=5;j++){
            if(i==1||i==5||j==1||j==5){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
            
        }
        System.out.println();
    }
}
}