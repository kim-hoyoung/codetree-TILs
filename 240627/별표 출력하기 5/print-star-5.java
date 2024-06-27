import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int a = 0; a < n; a++) {
            for (int b = 0; b < n; b++) {
                System.out.print("*");
            }
            System.out.print(" ");

        }
        System.out.println();

        for (int c = 0; c < n-1; c++) {
            for (int d = 0; d < n-1; d++) {
                System.out.print("*");
            }
            System.out.print(" ");
        } System.out.println();
        for (int e = 0; e < n-2; e++) {

            for (int f = 0; f < n-2; f++) {
                System.out.print("*");
            }
            System.out.print(" ");
        }

        for (int g = 0; g < n-3; g++) {
            System.out.println();
            for (int h = 0; h < n-3; h++) {
                System.out.print("*");
            }
        }

    }
}