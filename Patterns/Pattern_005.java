
/*
               *
             * * *
           * * * * *
         * * * * * * *
       * * * * * * * * *
 */


package Patterns;

public class Pattern_005 {
    public static void main(String[] args) {
        int rows = 5;

        for (int i=1; i<=rows; i++){
            for(int j=rows; j>i; j--){
                System.out.print(" " + " ");
            }
            for(int k=1; k<=i; k++ ){
                System.out.print("*" + " ");
            }
            for (int m=1; m<i; m++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
