import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count = 0;
        int sumVal = 0;
        double avg = 0;

        for(int i = 1; i <= 10; i++) {
            int n = sc.nextInt();
            if(n >= 0 && n <= 200) {
            count++;
            sumVal += n;
            }
        }

        System.out.printf("%d %.1f", sumVal, (double)sumVal/count);


        
        // 여기에 코드를 작성해주세요.
    }
}