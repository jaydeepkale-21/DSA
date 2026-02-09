        package Resursion_Consept;

        public class resursion_basic {
            public static int factorical(int n){
                if(n==0){
                    return 1; 
                }
                int fact=n*factorical(n-1);
                return fact;
            }

            // Printing sum of 1 to n number
            public static int num_sum(int n){
                if(n==1){
                    return 1;
                }
                int sum=n+num_sum(n-1);
                return sum;
            }

            //fibonacci series
            public static int fibo_series(int n){
                if(n==1 || n==0){
                    return n;
                }
                int fibn=fibo_series(n-1);
                int fibm=fibo_series(n-2);
                System.out.println(fibm+" "+fibn);
                int fib=fibn+fibm;
                return fib;
            }
            public static void main(String args[]){
                int n=25;
                System.out.println(fibo_series(n));
            }

        }
