import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[] arr = new int[10];
            int sum = 0;


            arr[0] = sc.nextInt();
            arr[1] = sc.nextInt();

            System.out.print(arr[0] + " " + arr[1] + " " );

            for ( int i = 2; i < 10; i ++) {
                arr[i] = arr[i-2] + arr[i-1];
                sum += arr[i];

                if (sum > 10) {
                    sum = sum%10;
                    System.out.print(sum + " ");
                } else if (sum%10 == 0) {
                    System.out.print(0 + " ");
                    sum = sum;
                }

                //System.out.print(sum + " ");

                sum = 0;

            }



        }
    }