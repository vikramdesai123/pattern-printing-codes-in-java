/*
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
 */


package Patterns;

public class Pattern_002 {
    public static void main(String[] args) {
        int rows = 5;
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
