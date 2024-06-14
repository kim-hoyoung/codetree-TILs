import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int a, b, sum;
        

        a = sc.nextInt();
        b = sc.nextInt();

        sum = a+b;


        System.out.printf(sum + " " + (double)sum/2);
    }
}