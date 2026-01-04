
import java.util.Scanner;

public class TwoDArray {
    public static void Find_Max_Min(int arr[][]){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                max=Math.max(max, arr[i][j]);
                min=Math.min(min, arr[i][j]);
            }
        }
        System.out.println("Maximum number is: "+max);
        System.out.println("Minimum number is: "+min);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row Size: ");
        int row=sc.nextInt();
        System.out.println("Enter col size: ");
        int col=sc.nextInt();
        int arr[][]=new int[row][col];
        System.out.println("Enter Element: ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        Find_Max_Min(arr);

    }
}
