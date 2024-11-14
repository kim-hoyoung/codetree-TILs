import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] arr = new char[10];
        int count = 0;

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.next().charAt(0);
            count++;
            if (count == 2 || count == 5  || count == 8) {
                System.out.print(arr[i] + " ");
            }
        }

    }
}
