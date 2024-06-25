import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        
        for (int j=1; j <= n; j ++){
                if  (j==3 && j==6 && j==9) {
                    System.out.print(0 + " ");
            }   else if (j % 3 ==0 )  {
                    System.out.print(0 + " ");
                } 
                else if ( j >= 30 && j <= 39) {
                    System.out.print( 0 + " ");
                } 
                else if ( j >= 60 && j <= 69) {
                    System.out.print( 0 + " ");
                } 
                else if (j >= 90 && j <= 99) {
                    System.out.print ( 0 + " ");
                } 
                else
                    System.out.print(j + " ");  

            }
        }
    }