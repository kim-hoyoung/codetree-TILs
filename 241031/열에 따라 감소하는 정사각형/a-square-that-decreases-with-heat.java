import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();

        for (int j = 0; j < count; j ++) {
            for (int i = count; i > 0; i--) {
                System.out.print(i + " ");
            }
        System.out.println();
        }
    }
}