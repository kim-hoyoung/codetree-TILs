import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int sumVal = 0;
    double avg = 0;
    int count = 0;

    int a = sc.nextInt();
    int b = sc.nextInt();

    for(int i = a; i <= b; i++) {
        if(i%5==0 || i%7==0) {
            count++;
            sumVal += i;
        }
    }
    System.out.printf("%d %.1f", sumVal ,(double)sumVal/count);
        // 여기에 코드를 작성해주세요.
    }
}