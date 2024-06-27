import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;

        for(int i = 1; i <= 100; i++) {
            sum = sum + i;
            if (sum+i >= n) {
                
                break;
            }           
        }System.out.print(sum);
    }
}