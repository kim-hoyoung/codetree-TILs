import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int[] arr = new int[100];
        int count = 0;
        int n = sc.nextInt();

        for (int i = 1; i < 11; i++) {
            arr[i] = i;
            arr[i] *= n;

            if ( arr[i] % 5 == 0) {
                count++;
                System.out.print(arr[i] + " ");
                if (count == 2) {
                    break;
                }
            }
            else
                System.out.print(arr[i] + " ");
        }

    }
}