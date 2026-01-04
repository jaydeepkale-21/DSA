public class Search_Sorted_2Darray {
    public static boolean  Search_Sorted_2Darray(int arr[][],int key){

                    // |10,|20,|30,|40|->Top_right_conner    at left_side=Small
                    // |15,|25,|35,|45|,                         bottam_side=Big
                    // |27,|29,|37,|48|,
//  Bottam_left_side<- |32,|33,|39,|50|
//  top_side=Small
//  Right_side=Big

        // Start form Top-Right-corner
        int row=0; int col=arr[0].length-1;
        while(row<arr.length && col>=0){
            if(key==arr[row][col]){
                System.out.println("Find key at: "+ row + " " + col);
                return true;
            }
            else if(key<arr[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("Key not find");
        return false;


    // Start Form the left-Bottom-Corner
    // int row=arr.length-1;
    // int col=0;
    // while(row>=0 && col<arr[0].length){
    //     if(key==arr[row][col]){
    //         System.out.println("Key find at position: "+row+" "+col);
    //         return true;
    //     }
    //     else if(key<arr[row][col]){
    //         row--;
    //     }
    //     else{
    //         col++;
    //     }

    // }
    // System.out.println("Key not prsent");
    // return false;
    }
     
    public static void main(String[] args) {
        int arr[][]={{10,20,30,40},
                    {15,25,35,45},
                    {27,29,37,48},
                    {32,33,39,50}
                };
        int key=33;
        Search_Sorted_2Darray(arr,key);
    }
}
