import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;

        for(int i = 1; i < 100; i++ ) {
            if(n/i != 0) {
                n = n/i;
                count++;
            }
            if (n == 1) {
                System.out.println(count);
                break;
            } else if (n/i <= 0) {
                count++;
                System.out.println(count);
                break;
            }
        }
    }
}