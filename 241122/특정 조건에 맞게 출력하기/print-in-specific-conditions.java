import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int[] arr = new int[100];
        int count = 0;

        for (int i = 0; i < 100; i++) {
            arr[i] = sc.nextInt();
            count++;

            if (arr[i] == 0) {
                for (int j = 0; j < count - 1; j++) {
                    if (arr[j] % 2 == 0) {
                        System.out.print(arr[j] / 2 + " ");

                    }
                    else if (arr[j] % 2 == 1) {
                        System.out.print(arr[j] + 3 + " ");
                    }
                }
                break;

            }
        }
    }
}