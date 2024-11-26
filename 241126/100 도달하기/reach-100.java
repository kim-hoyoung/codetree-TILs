import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[100];
        int count = 0;


        for(int i = 0; i < 100; i++) {
            if(i==0) {
                arr[count] = 1;
                System.out.print(arr[count] + " ");
            } else if(i==1) {
                arr[1] = n;
                count++;
                System.out.print(arr[count] + " ");

            } else if (i>1) {
                arr[i] = arr[count]+arr[count-1];
                System.out.print(arr[i] + " ");
                count++;
                if(arr[count]>100){
                    break;
                }
            }

        }

    }
}