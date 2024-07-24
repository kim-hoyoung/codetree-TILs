import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int count = sc.nextInt();


        for(int i = 0; i < count; i++) {
            for(int v = 0; v < count-(i+1); v++){
                System.out.print(" ");
            } for (int j = 0; j < 2*i + 1 ; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        for(int i = 0; i < count; i++) {
            for(int v = 0; v < i +1; v++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2*count)-(2*i)-3 ; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}