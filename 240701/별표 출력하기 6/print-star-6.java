import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            for (int i = 0;  i < n; i++) {
                for(int j = 0; j < i+i; j++) {
                System.out.print(" ");
                }
                for(int j = i+i; j < (2*n)-1; j++) {
                    System.out.print("* ");
                }

                System.out.println();
            } //아랫부분
            for (int i = 1;  i < n; i++) {
                for(int j = i+i; j < (2*n)-2; j++) {
                    System.out.print(" ");
                }
                for(int j = 1; j < n+(2*i)-2; j++) {
                    System.out.print("* ");
                }

                System.out.println();
            }


    }
}