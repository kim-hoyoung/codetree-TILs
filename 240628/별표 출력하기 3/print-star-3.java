import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            for(int j = i+i; j < (n*2)-1; j++) {
                System.out.print("* ");
            }
            System.out.println();

            for (int j = 0; j < 2+(i*2); j++) {
                System.out.print(" ");
            }

        }
    }
}