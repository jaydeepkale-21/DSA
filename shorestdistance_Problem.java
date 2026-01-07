public class shorestdistance_Problem {
    public static void shorestdistance_Problem(String name){
        int x_in=0;
        int y_in=0;
        int x_out=0;
        int y_out=0;
        for(int i=0;i<name.length();i++){
            if(name.charAt(i)=='E'){
                x_out++;
            }
            else if(name.charAt(i)=='W'){
                x_out--;
            } 
            else if(name.charAt(i)=='N'){
                y_out++;
            }
            else{
                y_out--;
            }
        }
        int dx=(x_out-x_in)*(x_out-x_in);
        int dy=(y_out-y_in)*(y_out-y_in);
        int result=(int)Math.sqrt((dx+dy));
        System.out.println("Shorest distance is: "+ result);
    }

    public static void main(String[] args) {
        String name="WNEENESENNN";
        shorestdistance_Problem(name);
        // System.out.println(Math.sqrt(25));
    }
    
}
