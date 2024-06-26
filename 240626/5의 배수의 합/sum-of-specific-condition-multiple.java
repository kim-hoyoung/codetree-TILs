import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int sumVal = 0;

        if ( a > b) {
            for( int i = b; i <= a; i++) {
                if(b%5 == 0) {
                    sumVal += b;
                }
            }
             System.out.print(sumVal);
        }
       

        if (a < b) {
            for (int i = a; i <= b; i++) {
                if(a%5 == 0) {
                    sumVal += a;
                }

            }
            System.out.print(sumVal);
        }
        
        else {
            System.out.print(a);
        }
        
    


        
    }
}