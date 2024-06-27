import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;

        int n = sc.nextInt();
        while(true) {
            if(n/2 != 1) {
                n = n/2;
                count++;
            }
            else if (n == 2) {
                count++;
                System.out.println(count);
                break;
            }
            else if (n ==1) {
                break;
            }

        }
    }
}