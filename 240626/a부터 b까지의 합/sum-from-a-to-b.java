import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sumVal = 0;
        int a = sc.nextInt();
        int b = sc.nextInt();
    

        for (int i = a; i <= b; i++) {
            sumVal += i;
        }
        System.out.print(sumVal);
    }
}