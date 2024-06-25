import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        


        

        for(int i = 1; i <= n; i ++) {
            if ( i % 3 ==0 )  {
                System.out.print(0 + " ");

            } else if ( i >= 30 && i <= 39) {
                System.out.print( 0 + " ");
            } else if ( i >= 60 && i <= 69) {
                System.out.print( 0 + " ");
            } else if (i >= 90 && i <= 99) {
                System.out.print ( 0 + " ");
            } else 
                System.out.print(i + " ");
                
        }



    }
}