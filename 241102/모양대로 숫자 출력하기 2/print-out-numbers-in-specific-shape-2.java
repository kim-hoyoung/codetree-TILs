import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        int cnt = 0;


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j ++) {
                cnt = cnt+2;

                if ( cnt == 10 ) {
                    cnt  = 2 ;
                }

                System.out.print(cnt + " ");

            }
            System.out.println();
        } 
        // 여기에 코드를 작성해주세요.
    }
}