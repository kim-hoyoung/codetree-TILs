import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int sumEver = 0;

        for(int i = a; i <= b; i++) {
            if (i%2 == 0) {
                sumEver += i;
            }
            
        }System.out.print(sumEver);


        // 여기에 코드를 작성해주세요.
    }
}