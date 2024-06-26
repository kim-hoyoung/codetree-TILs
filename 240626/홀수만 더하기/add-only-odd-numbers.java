import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sumVal = 0;

        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            int num = sc.nextInt();
            if (num%2 != 0 && num%3 ==0) {
                sumVal += num;
            }
        }
        System.out.print(sumVal);
    }
}