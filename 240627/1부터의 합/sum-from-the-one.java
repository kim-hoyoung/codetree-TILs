import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;
        int a = 0;

        for(int i = 1; i <= 100; i++) {
            sum = sum + i;
            if (sum >= n) {
                a = i;
                break;
            }        
        }System.out.print(a);   
    }
}