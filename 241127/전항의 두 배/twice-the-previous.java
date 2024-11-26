import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] arr = new int[100];
        arr[0] = n;
        arr[1] = x;

        for(int i = 0; i < 10; i++) {
            if(i==0) {
                System.out.print(arr[0] + " ");
            } else if(i==1) {
                System.out.print(arr[1] + " ");
            } else if (i>1) {
                arr[i] = arr[i-1]+2*arr[i-2];
                System.out.print(arr[i] + " ");

                }
            }

        }

    }