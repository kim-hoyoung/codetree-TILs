import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int eSum = 0;
        int oSum = 0;
        int min = 0;
        int max = 0;

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();

            if (i%2==0) {
                eSum += arr[i];

            } else if (i%2 ==1) {
                oSum += arr[i];
            }
        }
        if (eSum > oSum) {
            System.out.print(eSum - oSum);
        }
        else
            System.out.print(oSum - eSum);

    }
}
