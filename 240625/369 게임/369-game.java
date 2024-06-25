import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        int n = scanner.nextInt();
        
        for (int i = 1; i <= n; i++) {
            int num = i;
            int check369 = 0;
            
            // 숫자가 3의 배수인지 확인
            if (num % 3 == 0) {
                check369 = 1;
            }
            
            // 숫자에 3, 6, 9 중 하나가 포함되어 있는지 확인
            while (num > 0) {
                int digit = num % 10;
                if (digit == 3 || digit == 6 || digit == 9) {
                    check369 = 1;
                    break;
                }
                num /= 10;
            }
            
            if (check369 == 1) {
                System.out.print(0 + " ");
            } else {
                System.out.print(i + " ");
            }
        }
        
        scanner.close();
    }
}